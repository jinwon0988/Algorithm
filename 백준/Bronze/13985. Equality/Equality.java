import java.io.*;
import java.util.*;

public class Main {
	static String[][] A;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] A = br.readLine().split(" ");
		if (Integer.parseInt(A[0]) + Integer.parseInt(A[2]) == Integer.parseInt(A[4])) {
			bw.write("YES\n");
		} else {
			bw.write("NO\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}