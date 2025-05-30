import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int sum = 1;
			int score = 0;
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == 'O') {
					score += sum;
					sum++;
				} else {
					sum = 1;
				}
			}
			bw.write(score + "\n");
		}
		bw.flush();
		bw.close();
	}
}
