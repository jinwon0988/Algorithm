import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < N; tc++) {
			String input = br.readLine().toLowerCase();
			int[] A = new int[26];
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
					A[input.charAt(i) - 'a']++;
				}
			}
			boolean isFirst = true;
			String result = "";
			for (int i = 0; i < A.length; i++) {
				if (A[i] == 0) {
					if (isFirst) {
						result += "missing ";
						isFirst = false;
					}
					result += String.valueOf((char) (i + 'a'));
				}
			}
			if (result.equals("")) {
				bw.write("pangram\n");
			} else {
				bw.write(result + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}