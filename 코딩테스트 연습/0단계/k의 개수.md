# k의 개수
1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 `i`, `j`, `k`가 매개변수로 주어질 때, `i`부터 `j`까지 `k`가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

## Python
```python
def solution(i, j, k):
    count = 0
    k = str(k)
    for n in range(i, j+1):
        for s in str(n):
            if s == k:
                count += 1
    return count
```