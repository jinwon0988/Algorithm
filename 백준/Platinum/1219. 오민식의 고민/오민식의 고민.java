import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int startCity = Integer.parseInt(st.nextToken());
		int endCity = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Edge[] edges = new Edge[M];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			edges[i] = new Edge(start, end, value);
		}
		long[] cityMoney = new long[N];
		long[] distance = new long[N];
		Arrays.fill(distance, Long.MIN_VALUE);
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			cityMoney[i] = Long.parseLong(st.nextToken());
		}
		distance[startCity] = cityMoney[startCity];
		for (int i = 0; i <= N + 100; i++) {
			for (int j = 0; j < M; j++) {
				Edge edge = edges[j];
				if (distance[edge.start] == Long.MIN_VALUE)
					continue;
				else if (distance[edge.start] == Long.MAX_VALUE) {
					distance[edge.end] = Long.MAX_VALUE;
				} else if (distance[edge.end] < distance[edge.start] + cityMoney[edge.end] - edge.value) {
					distance[edge.end] = distance[edge.start] + cityMoney[edge.end] - edge.value;
					if (i >= N - 1) {
						distance[edge.end] = Long.MAX_VALUE;
					}
				}
			}
		}
		if (distance[endCity] == Long.MIN_VALUE)
			bw.write("gg\n");
		else if (distance[endCity] == Long.MAX_VALUE)
			bw.write("Gee");
		else
			bw.write(distance[endCity] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static class Edge {
		int start, end, value;

		public Edge(int start, int end, int value) {
			this.start = start;
			this.end = end;
			this.value = value;
		}
	}
}
