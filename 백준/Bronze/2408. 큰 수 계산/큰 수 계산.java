import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ArrayList<String> A = new ArrayList<>();
		int l = N + N - 1;
		for (int i = 0; i < l; i++) {
			String input = br.readLine();
			A.add(input);
		}
		for (int i = 0; i < l; i++) {
			if (A.get(i).equals("*")) {
				BigInteger a = new BigInteger(A.get(i - 1));
				BigInteger b = new BigInteger(A.get(i + 1));
				A.set(i - 1, String.valueOf(a.multiply(b)));
				A.remove(i);
				A.remove(i);
				i--;
				l -= 2;
			} else if (A.get(i).equals("/")) {
				BigDecimal a = new BigDecimal(A.get(i - 1));
				BigDecimal b = new BigDecimal(A.get(i + 1));
				A.set(i - 1, String.valueOf(a.divide(b, 0, RoundingMode.FLOOR).toBigInteger()));
				A.remove(i);
				A.remove(i);
				i--;
				l -= 2;
			}
		}
		for (int i = 0; i < l; i++) {
			if (A.get(i).equals("+")) {
				BigInteger a = new BigInteger(A.get(i - 1));
				BigInteger b = new BigInteger(A.get(i + 1));
				A.set(i - 1, String.valueOf(a.add(b)));
				A.remove(i);
				A.remove(i);
				i--;
				l -= 2;
			} else if (A.get(i).equals("-")) {
				BigInteger a = new BigInteger(A.get(i - 1));
				BigInteger b = new BigInteger(A.get(i + 1));
				A.set(i - 1, String.valueOf(a.subtract(b)));
				A.remove(i);
				A.remove(i);
				i--;
				l -= 2;
			}
		}
		bw.write(A.get(0) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}