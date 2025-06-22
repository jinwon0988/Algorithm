import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		for (int i = 0; i < N - 1; i++) {
			queue.poll();
			queue.add(queue.poll());
		}
		bw.write(queue.peek() + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
