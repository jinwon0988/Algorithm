import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		tNode root = new tNode();
		for (int i = 0; i < N; i++) {
			String text = br.readLine();
			tNode now = root;
			for (int j = 0; j < text.length(); j++) {
				char c = text.charAt(j);
				if (now.next[c - 'a'] == null) {
					now.next[c - 'a'] = new tNode();
				}
				now = now.next[c - 'a'];
				if (j == text.length() - 1) {
					now.isEnd = true;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < M; i++) {
			String text = br.readLine();
			tNode now = root;
			for (int j = 0; j < text.length(); j++) {
				char c = text.charAt(j);
				if (now.next[c - 'a'] == null) {
					break;
				}
				now = now.next[c - 'a'];
				if (j == text.length() - 1 && now.isEnd)
					count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static class tNode {
		tNode[] next = new tNode[26];
		boolean isEnd;
	}
}
