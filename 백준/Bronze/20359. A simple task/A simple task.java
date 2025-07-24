import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int o = 1, p = 0;
		while (true) {
			if (o * Math.pow(2, p) > n) {
				o++;
				p = 0;
			}
			if (o * Math.pow(2, p) == n)
				break;
			p++;
		}
		bw.write(o + " " + p + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}