import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int order = 1;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			stack.push(num);
			while (!stack.isEmpty() && stack.peek() == order) {
				stack.pop();
				order++;
			}
		}
		if (stack.isEmpty())
			bw.write("Nice\n");
		else
			bw.write("Sad\n");
		bw.flush();
		bw.close();
		br.close();
	}
}