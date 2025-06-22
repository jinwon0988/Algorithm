import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		Stack<Integer> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		for (int i = 1, j = 0; i <= N; i++) {
			stack.add(i);
			sb.append("+\n");
			while (!stack.empty() && stack.peek() == A[j]) {
				stack.pop();
				sb.append("-\n");
				j++;
			}
		}
		if (!stack.empty())
			System.out.println("NO");
		else
			System.out.println(sb.toString());
		br.close();
	}
}
