# A로 B 만들기
문자열 `before`와 `after`가 매개변수로 주어질 때, `before`의 순서를 바꾸어 `after`를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

## Python
```python
from collections import Counter

def solution(before, after):
    b_count = Counter(before)
    a_count = Counter(after)
    return int(b_count == a_count)
```