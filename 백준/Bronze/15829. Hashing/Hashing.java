import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] A = new int[L];
		int r = 1;
		long sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += (str.charAt(i) - 'a' + 1) * r;
			r *= 31;
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
