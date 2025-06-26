import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int[] S = new int[21];
		StringTokenizer st;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			int num;
			switch (command) {
			case "add":
				num = Integer.parseInt(st.nextToken());
				if (S[num] == 0)
					S[num] = 1;
				break;
			case "remove":
				num = Integer.parseInt(st.nextToken());
				if (S[num] == 1)
					S[num] = 0;
				break;
			case "check":
				num = Integer.parseInt(st.nextToken());
				bw.write(S[num] + "\n");
				break;
			case "toggle":
				num = Integer.parseInt(st.nextToken());
				if (S[num] == 0)
					S[num] = 1;
				else
					S[num] = 0;
				break;
			case "all":
				for (int j = 1; j <= 20; j++)
					S[j] = 1;
				break;
			case "empty":
				for (int j = 1; j <= 20; j++)
					S[j] = 0;
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}