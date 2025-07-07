import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		String result = "";
		while (N > 0) {
			long num = N % B;
			if (num >= 10) {
				result = String.valueOf((char) (num - 10 + 'A')) + result;
			} else {
				result = String.valueOf(num) + result;
			}
			N /= B;
		}
		if (result.equals(""))
			result = "0";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
}