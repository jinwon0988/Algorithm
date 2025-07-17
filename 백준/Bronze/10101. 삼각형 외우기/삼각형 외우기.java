import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		if (A + B + C == 180) {
			if (A == B && B == C) {
				bw.write("Equilateral\n");
			} else if (A == B || B == C || A == C) {
				bw.write("Isosceles\n");
			} else {
				bw.write("Scalene\n");
			}
		} else {
			bw.write("Error\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}