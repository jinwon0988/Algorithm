import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long N = Long.parseLong(br.readLine());
		long num = 3;
		long plus = 5;
		int count = 1;
		while (true) {
			if (N <= num) {
				break;
			} else {
				num += plus;
				count++;
				plus += 2;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}