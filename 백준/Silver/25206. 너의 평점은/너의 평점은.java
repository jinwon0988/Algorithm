import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		double credit = 0.0;
		double score = 0.0;
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			double c = Double.parseDouble(st.nextToken());
			String str = st.nextToken();
			if (str.equals("P"))
				continue;
			double s = 0.0;
			switch (str) {
			case "A+":
				s = 4.5;
				break;
			case "A0":
				s = 4.0;
				break;
			case "B+":
				s = 3.5;
				break;
			case "B0":
				s = 3.0;
				break;
			case "C+":
				s = 2.5;
				break;
			case "C0":
				s = 2.0;
				break;
			case "D+":
				s = 1.5;
				break;
			case "D0":
				s = 1.0;
				break;
			case "F":
				s = 0.0;
				break;
			}
			credit += c;
			score += s * c;
		}
		bw.write(score / credit + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}