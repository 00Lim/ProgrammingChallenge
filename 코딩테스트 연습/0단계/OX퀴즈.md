# OX퀴즈
덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 `quiz`가 매개변수로 주어집니다. 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

## Python
```python
def solution(quiz):
    answer = []
    for q in quiz:
        con1, con2 = q.split('=')
        result = "O" if eval(con1) == eval(con2) else "X"
        answer.append(result)
    return answer
```