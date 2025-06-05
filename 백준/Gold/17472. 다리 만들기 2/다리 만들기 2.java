import java.io.*;
import java.util.*;

public class Main {
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int[] parent;
	static int[][] map;
	static int N, M, sNum;
	static boolean[][] visited;
	static ArrayList<ArrayList<int[]>> sumlist;
	static ArrayList<int[]> mlist;
	static PriorityQueue<bEdge> pq;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		sNum = 1;
		sumlist = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] != 0 && visited[i][j] != true) {
					BFS(i, j);
					sNum++;
					sumlist.add(mlist);
				}
			}
		}
		pq = new PriorityQueue<>();
		for (int i = 0; i < sumlist.size(); i++) {
			ArrayList<int[]> now = sumlist.get(i);
			for (int j = 0; j < now.size(); j++) {
				int r = now.get(j)[0];
				int c = now.get(j)[1];
				int nowS = map[r][c];
				for (int d = 0; d < 4; d++) {
					int tempR = dr[d];
					int tempC = dc[d];
					int blenght = 0;
					while (r + tempR >= 0 && r + tempR < N && c + tempC >= 0 && c + tempC < M) {
						if (map[r + tempR][c + tempC] == nowS)
							break;
						else if (map[r + tempR][c + tempC] != 0) {
							if (blenght > 1)
								pq.add(new bEdge(nowS, map[r + tempR][c + tempC], blenght));
							break;
						} else
							blenght++;
						if (tempR < 0)
							tempR--;
						else if (tempR > 0)
							tempR++;
						else if (tempC < 0)
							tempC--;
						else if (tempC > 0)
							tempC++;
					}
				}
			}
		}
		parent = new int[sNum];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
		int useEdge = 0;
		int result = 0;
		while (!pq.isEmpty()) {
			bEdge now = pq.poll();
			if (find(now.s) != find(now.e)) {
				union(now.s, now.e);
				result += now.v;
				useEdge++;
			}
		}
		if (useEdge == sNum - 2) {
			bw.write(result + "\n");
		} else {
			bw.write(-1 + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b) {
			parent[b] = a;
		}
	}

	public static int find(int a) {
		if (a == parent[a])
			return a;
		else
			return parent[a] = find(parent[a]);
	}

	public static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		mlist = new ArrayList<>();
		int[] start = { i, j };
		queue.add(start);
		mlist.add(start);
		visited[i][j] = true;
		map[i][j] = sNum;
		while (!queue.isEmpty()) {
			int now[] = queue.poll();
			for (int d = 0; d < 4; d++) {
				int tempR = dr[d];
				int tempC = dc[d];
				while (now[0] + tempR >= 0 && now[0] + tempR < N && now[1] + tempC >= 0 && now[1] + tempC < M) {
					if (visited[now[0] + tempR][now[1] + tempC] == false && map[now[0] + tempR][now[1] + tempC] != 0) {
						addNode(now[0] + tempR, now[1] + tempC, queue);
					} else
						break;
					if (tempR < 0)
						tempR--;
					else if (tempR > 0)
						tempR++;
					else if (tempC < 0)
						tempC--;
					else if (tempC > 0)
						tempC++;
				}
			}
		}
	}

	public static void addNode(int i, int j, Queue<int[]> queue) {
		map[i][j] = sNum;
		visited[i][j] = true;
		int[] temp = { i, j };
		mlist.add(temp);
		queue.add(temp);
	}

	public static class bEdge implements Comparable<bEdge> {
		int s, e, v;

		public bEdge(int s, int e, int v) {
			this.s = s;
			this.e = e;
			this.v = v;
		}

		@Override
		public int compareTo(bEdge o) {
			return this.v - o.v;
		}
	}
}