import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		int[] answer = new int[N];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
				answer[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			answer[stack.pop()] = -1;
		}
		for (int i = 0; i < N; i++) {
			bw.write(answer[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
