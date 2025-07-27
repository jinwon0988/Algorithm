import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			switch (command) {
			case 1:
				int X = Integer.parseInt(st.nextToken());
				stack.push(X);
				break;
			case 2:
				if (stack.isEmpty())
					bw.write("-1\n");
				else
					bw.write(stack.pop() + "\n");
				break;
			case 3:
				bw.write(stack.size() + "\n");
				break;
			case 4:
				if (stack.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
				break;
			case 5:
				if (stack.isEmpty())
					bw.write("-1\n");
				else
					bw.write(stack.peek() + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}