import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		while ((input = br.readLine()) != null && !input.isEmpty()) {
			int N = Integer.parseInt(input);
			int diag = 1;
			int count = 0;
			while (diag + count < N) {
				count += diag;
				diag++;
			}
			int a, b;
			if (diag % 2 == 0) {
				a = N - count;
				b = diag - a + 1;
			} else {
				b = N - count;
				a = diag - b + 1;
			}
			bw.write("TERM " + N + " IS " + a + "/" + b + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}