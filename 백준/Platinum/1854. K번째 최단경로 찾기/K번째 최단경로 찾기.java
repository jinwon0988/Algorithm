import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<cNode>[] nodeList;
	static PriorityQueue<Integer>[] distQueue;
	static int K;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		nodeList = new ArrayList[N + 1];
		for (int i = 0; i <= N; i++) {
			nodeList[i] = new ArrayList<>();
		}
		distQueue = new PriorityQueue[N + 1];
		Comparator<Integer> cp = new Comparator<>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 < o2) ? 1 : -1;
			}
		};
		for (int i = 0; i <= N; i++) {
			distQueue[i] = new PriorityQueue<>(K, cp);
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			nodeList[s].add(new cNode(e, w));
		}
		dijkstra(1, N);
		for (int i = 1; i <= N; i++) {
			if (distQueue[i].size() == K) {
				bw.write(distQueue[i].peek() + "\n");
			} else {
				bw.write(-1 + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void dijkstra(int start, int end) {
		PriorityQueue<cNode> pq = new PriorityQueue<>();
		pq.add(new cNode(start, 0));
		distQueue[1].add(0);
		while (!pq.isEmpty()) {
			cNode nowNode = pq.poll();
			for (cNode next : nodeList[nowNode.node]) {
				if (distQueue[next.node].size() < K) {
					distQueue[next.node].add(nowNode.cost + next.cost);
					pq.add(new cNode(next.node, nowNode.cost + next.cost));
				} else if (distQueue[next.node].peek() > nowNode.cost + next.cost) {
					distQueue[next.node].poll();
					distQueue[next.node].add(nowNode.cost + next.cost);
					pq.add(new cNode(next.node, nowNode.cost + next.cost));
				}
			}
		}
	}

	public static class cNode implements Comparable<cNode> {
		int node;
		int cost;

		public cNode(int node, int cost) {
			this.node = node;
			this.cost = cost;
		}

		@Override
		public int compareTo(cNode o) {
			return (this.cost < o.cost) ? -1 : 1;
		}
	}
}
