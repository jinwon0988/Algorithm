import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		BigDecimal bA = new BigDecimal(A);
		BigDecimal bB = new BigDecimal(B);
		bw.write(bA.multiply(bB) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}