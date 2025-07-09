import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String A = br.readLine();
		String op = br.readLine();
		String B = br.readLine();
		if (op.equals("*")) {
			bw.write(A + B.substring(1));
		} else {
			if (A.length() == B.length()) {
				bw.write("2" + A.substring(1));
			} else if (A.length() > B.length()) {
				bw.write(A.substring(0, A.length() - B.length()) + B);
			} else {
				bw.write(B.substring(0, B.length() - A.length()) + A);
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}