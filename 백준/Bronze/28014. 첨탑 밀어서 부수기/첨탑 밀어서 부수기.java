import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) {
			int next = Integer.parseInt(st.nextToken());
			if (num <= next) count++;
			num = next;
		}
		bw.write(count + "\n");
		bw.close();
		br.close();
	}
}