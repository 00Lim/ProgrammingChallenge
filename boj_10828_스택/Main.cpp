#include <iostream>
#include <stack>
#include <string>

using namespace std;

int main(void)
{
	int N;	// 명령의 개수
	cin >> N;

	stack<int> stk;	// 스택
	string str;

	// 명령의 개수만큼 반복
	for(int i = 0; i < N; i++)
	{
		cin >> str;

		if(str == "push")
		{
			int x;
			cin >> x;
			stk.push(x);
		}
		else if(str == "pop")
		{
			if(stk.empty())
			{
				cout << "-1" << endl;
			}
			else
			{
				cout << stk.top() << endl;
				stk.pop();
			}
		}
		else if(str == "size")
		{
			cout << stk.size() << endl;
		}
		else if(str == "empty")
		{
			cout << (stk.empty() ? "1" : "0") << endl;
		}
		else if(str == "top")
		{
			cout << (stk.empty() ? -1 : stk.top()) << endl;
		}
	}
}