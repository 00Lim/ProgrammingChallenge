import sys

N = int(sys.stdin.readline())   # 명령의 수
stack = []  # 스택

# 명령의 수만큼 반복
for _ in range(N):
    comm = sys.stdin.readline().split()
    
    # 명령의 종류에 따라 행동을 한다
    if comm[0] == 'push':
        stack.append(comm[1])
    elif comm[0] == 'pop':
        print(-1 if len(stack) == 0 else stack.pop())
    elif comm[0] == 'size':
        print(len(stack))
    elif comm[0] == 'empty':
        print(1 if len(stack) == 0 else 0)
    elif comm[0] == 'top':
        print(-1 if len(stack) == 0 else stack[-1])