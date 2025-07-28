import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Node[] node = new Node[N];
		for (int i = 0; i < N; i++) {
			String[] input = Arrays.stream(br.readLine().split("[\\[{\":,}\\]]+")).filter(s -> !s.isEmpty())
					.toArray(String[]::new);
			node[i] = new Node(input[1], Integer.parseInt(input[3]), ((input[5].equals("1")) ? true : false), 0);
		}
		Arrays.sort(node, (o1, o2) -> {
			if (o1.score == o2.score) {
				return o1.name.compareTo(o2.name);
			}
			return Integer.compare(o2.score, o1.score);
		});
		node[0].rank = 1;
		for (int i = 1; i < node.length; i++) {
			if (node[i].score == node[i - 1].score)
				node[i].rank = node[i - 1].rank;
			else
				node[i].rank = i + 1;
		}
		for (int i = 0; i < node.length; i++) {
			if (!node[i].isHidden)
				bw.write(node[i].rank + " " + node[i].name + " " + node[i].score + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	static class Node {
		String name;
		int score;
		boolean isHidden;
		int rank;

		public Node(String name, int score, boolean isHidden, int rank) {
			this.name = name;
			this.score = score;
			this.isHidden = isHidden;
			this.rank = rank;
		}
	}
}