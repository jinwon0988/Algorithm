import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		st = new StringTokenizer(br.readLine());
		double C = Double.parseDouble(st.nextToken());
		double D = Double.parseDouble(st.nextToken());
		double max = 0.0;
		int count = 0;
		if ((A / C + B / D) > max) {
			max = A / C + B / D;
		}
		if ((C / D + A / B) > max) {
			max = C / D + A / B;
			count = 1;
		}
		if ((D / B + C / A) > max) {
			max = D / B + C / A;
			count = 2;
		}
		if ((B / A + D / C) > max) {
			max = B / A + D / C;
			count = 3;
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}