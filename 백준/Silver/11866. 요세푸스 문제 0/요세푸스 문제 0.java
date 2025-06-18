import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++)
			queue.add(i);
		bw.write("<");
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < K - 1; j++) {
				int num = queue.poll();
				queue.add(num);
			}
			bw.write(queue.poll() + ", ");
		}
		bw.write(queue.poll() + ">");
		bw.flush();
		bw.close();
		br.close();
	}
}
