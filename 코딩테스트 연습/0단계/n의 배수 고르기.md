# n의 배수 고르기
정수 `n`과 정수 배열 `numlist`가 매개변수로 주어질 때, `numlist`에서 `n`의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

## Python
```python
def solution(n, numlist):
    return [i for i in numlist if i % n == 0]
```