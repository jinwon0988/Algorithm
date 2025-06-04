import java.io.*;
import java.util.*;

public class Main {
	static int N, M;
	static ArrayList<Node>[] edgeList;
	static int[] distance;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		edgeList = new ArrayList[N + 1];
		for (int i = 0; i <= N; i++) {
			edgeList[i] = new ArrayList<>();
		}
		distance = new int[N + 1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		visited = new boolean[N + 1];
		StringTokenizer st;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			edgeList[start].add(new Node(end, weight));
		}
		st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int result = dijkstra(S, E);
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

	public static int dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		distance[start] = 0;
		while (!pq.isEmpty()) {
			Node nowNode = pq.poll();
			if (!visited[nowNode.targetNode]) {
				visited[nowNode.targetNode] = true;
				for (Node n : edgeList[nowNode.targetNode]) {
					if (distance[n.targetNode] > distance[nowNode.targetNode] + n.value) {
						distance[n.targetNode] = distance[nowNode.targetNode] + n.value;
						pq.add(new Node(n.targetNode, distance[n.targetNode]));
					}
				}
			}
		}
		return distance[end];
	}

	public static class Node implements Comparable<Node> {
		int targetNode;
		int value;

		Node(int targetNode, int value) {
			this.targetNode = targetNode;
			this.value = value;
		}

		@Override
		public int compareTo(Node o) {
			return this.value - o.value;
		}
	}
}
