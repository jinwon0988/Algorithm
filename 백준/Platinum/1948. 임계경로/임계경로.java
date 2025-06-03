import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Node>> A = new ArrayList<>();
		ArrayList<ArrayList<Node>> reverseA = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			A.add(new ArrayList<>());
			reverseA.add(new ArrayList<>());
		}
		int[] indegree = new int[N + 1];
		StringTokenizer st;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			A.get(S).add(new Node(E, V));
			reverseA.get(E).add(new Node(S, V));
			indegree[E]++;
		}
		st = new StringTokenizer(br.readLine());
		int startCity = Integer.parseInt(st.nextToken());
		int endCity = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(startCity);
		int[] result = new int[N + 1];
		while (!queue.isEmpty()) {
			int now = queue.poll();
			for (Node next : A.get(now)) {
				indegree[next.targetNode]--;
				result[next.targetNode] = Math.max(result[next.targetNode], result[now] + next.value);
				if (indegree[next.targetNode] == 0) {
					queue.offer(next.targetNode);
				}
			}
		}
		int resultCount = 0;
		boolean[] visited = new boolean[N + 1];
		queue = new LinkedList<>();
		queue.offer(endCity);
		while (!queue.isEmpty()) {
			int now = queue.poll();
			for (Node next : reverseA.get(now)) {
				if (result[next.targetNode] + next.value == result[now]) {
					resultCount++;
					if (!visited[next.targetNode]) {
						visited[next.targetNode] = true;
						queue.offer(next.targetNode);
					}
				}
			}
		}
		bw.write(result[endCity] + "\n");
		bw.write(resultCount + "\n");
		bw.flush();
		bw.close();
	}
}

class Node {
	int targetNode;
	int value;

	Node(int targetNode, int value) {
		this.targetNode = targetNode;
		this.value = value;
	}
}
