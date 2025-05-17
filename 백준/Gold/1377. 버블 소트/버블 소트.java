import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
	int num;
	int idx;

	Node(int num, int idx) {
		this.num = num;
		this.idx = idx;
	}

	@Override
	public int compareTo(Node o) {
		return num - o.num;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Node[] A = new Node[N];
		for (int i = 0; i < N; i++) {
			A[i] = new Node(Integer.parseInt(br.readLine()), i);
		}
		Arrays.sort(A);
		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, A[i].idx - i);
		}
		bw.write((max + 1) + "\n");
		bw.flush();
		bw.close();
	}
}
