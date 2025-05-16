import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		Deque<int[]> q = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			while (!q.isEmpty() && q.peekLast()[0] > num)
				q.pollLast();
			q.offer(new int[] { num, i });
			if (q.peek()[1] < i - (L - 1))
				q.poll();
			bw.write(q.peek()[0] + " ");
		}
		bw.flush();
		bw.close();
	}
}
