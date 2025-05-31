import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[] num = new int[3];
		while (true) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num);
			if (num[0] == 0 && num[1] == 0 && num[2] == 0)
				break;
			if ((num[0] * num[0] + num[1] * num[1]) == (num[2] * num[2])) {
				bw.write("right\n");
			} else {
				bw.write("wrong\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
