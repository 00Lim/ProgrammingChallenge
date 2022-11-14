[![image](https://user-images.githubusercontent.com/54588441/201673896-50593125-7ee8-48a0-a78c-88165c8533d8.png)
](https://acmicpc.net/problem/9613)

## Python
```python
import math

# 주어진 수들의 최대공약수의 합
# 두 수씩 짝지어서 최대공약수들을 뽑아낸 다음 그들의 합을 구한다

t = int(input())    # 테스트케이스 개수

for _ in range(t):
    nums = list(map(int, input().split()))
    n = nums.pop(0)
    gcd = 0
    # 두 수씩 묶어서 최대공약수를 구한다
    for i in range(n):
        for j in range(n):
            if i >= j:
                continue
            gcd += math.gcd(nums[i], nums[j])
    print(gcd)
```