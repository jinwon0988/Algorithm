import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			String[][] A = new String[N][2];
			for (int i = 0; i < N; i++) {
				String str = br.readLine();
				A[i][0] = str.toUpperCase();
				A[i][1] = str;
			}
			Arrays.sort(A, (o1, o2) -> {
				if (o1[0].equals(o2[0])) {
					return o1[1].compareTo(o2[1]);
				}
				return o1[0].compareTo(o2[0]);
			});
			bw.write(A[0][1] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}