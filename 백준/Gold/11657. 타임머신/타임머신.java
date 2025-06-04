import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Edge edges[] = new Edge[M + 1];
		long[] distance = new long[N + 1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			edges[i] = new Edge(start, end, time);
		}
		distance[1] = 0;
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < M; j++) {
				Edge edge = edges[j];
				if (distance[edge.start] != Integer.MAX_VALUE
						&& distance[edge.end] > distance[edge.start] + edge.time) {
					distance[edge.end] = distance[edge.start] + edge.time;
				}
			}
		}
		boolean mCycle = false;
		for (int j = 0; j < M; j++) {
			Edge edge = edges[j];
			if (distance[edge.start] != Integer.MAX_VALUE && distance[edge.end] > distance[edge.start] + edge.time) {
				mCycle = true;
				break;
			}
		}
		if (!mCycle) {
			for (int i = 2; i <= N; i++) {
				if (distance[i] == Integer.MAX_VALUE) {
					bw.write(-1 + "\n");
				} else {
					bw.write(distance[i] + "\n");
				}
			}
		} else {
			bw.write(-1 + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static class Edge {
		int start, end, time;

		public Edge(int start, int end, int time) {
			this.start = start;
			this.end = end;
			this.time = time;
		}
	}
}
