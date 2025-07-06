import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] N = st.nextToken().toCharArray();
		int B = Integer.parseInt(st.nextToken());
		long mul = 1;
		long result = 0;
		for (int i = N.length - 1; i >= 0; i--) {
			if (N[i] >= '0' && N[i] <= '9') {
				result += (N[i] - '0') * mul;
			} else {
				result += (N[i] - 'A' + 10) * mul;
			}
			mul *= B;
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}