import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st;
		long sum = 0;
		long xor = 0;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			long num;
			switch (command) {
			case 1:
				num = Integer.parseInt(st.nextToken());
				sum += num;
				xor ^= num;
				break;
			case 2:
				num = Integer.parseInt(st.nextToken());
				sum -= num;
				xor ^= num;
				break;
			case 3:
				bw.write(sum + "\n");
				break;
			case 4:
				bw.write(xor + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}