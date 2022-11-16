[![image](https://user-images.githubusercontent.com/54588441/202205628-0dca55f2-1b7c-4819-8570-1ae10300871d.png)](https://acmicpc.net/problem/11576)

## Python
```python
A, B = map(int, input().split())
m = int(input())
nums = list(map(int, input().split()))[::-1]

A_10 = 0

# A진수를 10진수로 바꿔준다
for i in range(len(nums)):
    A_10 += nums[i] * (A ** i)

result = []
while A_10:
    result.append(A_10 % B)
    A_10 //= B
print(' '.join(map(str, result[::-1])))
```