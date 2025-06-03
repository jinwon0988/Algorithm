import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			A.add(new ArrayList<>());
		}
		int[] indegree = new int[N + 1];
		int[] buildTime = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			buildTime[i] = Integer.parseInt(st.nextToken());
			while (true) {
				int pre = Integer.parseInt(st.nextToken());
				if (pre == -1)
					break;
				A.get(pre).add(i);
				indegree[i]++;
			}
		}
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0) {
				queue.offer(i);
			}
		}
		int[] result = new int[N + 1];
		while (!queue.isEmpty()) {
			int now = queue.poll();
			for (int next : A.get(now)) {
				indegree[next]--;
				result[next] = Math.max(result[next], result[now] + buildTime[now]);
				if (indegree[next] == 0) {
					queue.offer(next);
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			bw.write(result[i] + buildTime[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
