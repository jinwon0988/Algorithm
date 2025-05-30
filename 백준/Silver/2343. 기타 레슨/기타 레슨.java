import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] lesson = new int[N];
		st = new StringTokenizer(br.readLine());
		int start = 0, end = 0;
		for (int i = 0; i < N; i++) {
			lesson[i] = Integer.parseInt(st.nextToken());
			start = Math.max(start, lesson[i]);
			end += lesson[i];
		}
		while (start <= end) {
			int mid = (start + end) / 2;
			int sum = 0;
			int count = 1;
			for (int i = 0; i < N; i++) {
				sum += lesson[i];
				if (sum > mid) {
					sum = lesson[i];
					count++;
				}
			}
			if (count <= M)
				end = mid - 1;
			else
				start = mid + 1;
		}
		bw.write(start + "\n");
		bw.flush();
		bw.close();
	}
}
