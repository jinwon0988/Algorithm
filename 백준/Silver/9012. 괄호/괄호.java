import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			int result = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(')
					result++;
				else
					result--;
				if (result < 0)
					break;
			}
			if (result == 0)
				bw.write("YES\n");
			else
				bw.write("NO\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
