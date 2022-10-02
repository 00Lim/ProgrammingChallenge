import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(reader.readLine());    // 명령 개수
		Stack<String> stack = new Stack<>();
		
        // 명령 개수만큼 반복
		for(int i = 0; i < N; i++)
		{
			try
			{
				String command[] = reader.readLine().split(" ");
				
                // 입력받은 명령의 종류에 따라 다른 행동 수행
				if(command[0].equals("push"))
				{
					stack.push(command[1]);
				}
				else if(command[0].equals("pop"))
				{
					writer.write(stack.pop() + "\n");
				}
				else if(command[0].equals("size"))
				{
					writer.write(stack.size() + "\n");
				}
				else if(command[0].equals("empty"))
				{
					if(stack.isEmpty())
					{
						writer.write("1\n");
					}
					else
					{
						writer.write("0\n");
					}
				}
				else
				{
					writer.write(stack.peek() + "\n");
				}
			}
            // 만약 스택이 비었는데 pop이나 top 명령을 수행하려 한다면
            // 예외처리를 통하여 -1을 출력하게 한다
			catch(EmptyStackException e)
			{
				writer.write("-1\n");
			}
			
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}