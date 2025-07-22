import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			String N = st.nextToken();
			String M = st.nextToken();
			int count = 0;
			int N1 = 0, M1 = 0;
			for (int j = 0; j < N.length(); j++) {
				if (N.charAt(j) == '1')
					N1++;
				if (M.charAt(j) == '1')
					M1++;
				if (N.charAt(j) != M.charAt(j))
					count++;
			}
			int result = Math.abs(N1 - M1);
			count -= result;
			result += count / 2;
			bw.write(result + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

// 1011
// 1100