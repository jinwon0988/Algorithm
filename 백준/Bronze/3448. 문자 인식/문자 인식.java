import java.io.*;
import java.text.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		DecimalFormat df = new DecimalFormat("#.#");
		for (int t = 0; t < N; t++) {
			int len = 0;
			int rec = 0;
			while (true) {
				String str = br.readLine();
				if (str == null || str.isEmpty())
					break;
				len += str.length();
				str = str.replaceAll("#", "");
				rec += str.length();
			}
			double result = (double) rec / len * 100;
			bw.write("Efficiency ratio is " + df.format(result) + "%.\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}