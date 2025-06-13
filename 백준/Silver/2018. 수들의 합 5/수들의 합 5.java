import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		if (N != 1) {
			int s = 1;
			int e = 2;
			int sum = s + e;
			while (s != e) {
				if (sum == N) {
					count++;
					e++;
					sum += e;
				} else if (sum > N) {
					sum -= s;
					s++;
				} else {
					e++;
					sum += e;
				}
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
