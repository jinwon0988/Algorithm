import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int t = 1; t <= N; t++) {
			st = new StringTokenizer(br.readLine());
			String A = st.nextToken();
			String B = st.nextToken();
			if (A.equals(B)) {
				bw.write("Case " + t + ": Login successful.\n");
			} else {
				String strA = A.replaceAll("[0-9]", "");
				String strB = B.replaceAll("[0-9]", "");
				String changeStrB = "";
				String numA = A.replaceAll("[^0-9]", "");
				String numB = B.replaceAll("[^0-9]", "");
				for (int i = 0; i < B.length(); i++) {
					char ch = B.charAt(i);
					if ('A' <= ch && ch <= 'Z') {
						changeStrB += (char) (ch - 'A' + 'a');
					} else if ('a' <= ch && ch <= 'z') {
						changeStrB += (char) (ch - 'a' + 'A');
					}
				}
				boolean isCapsLock = false;
				boolean isNumLock = false;
				if (strA.equals(changeStrB))
					isCapsLock = true;
				if ((A.length() - strA.length()) != 0 && (B.length() - changeStrB.length()) == 0)
					isNumLock = true;
				if (!(strA.equals(strB) || isCapsLock) || !(numA.equals(numB) || isNumLock)) {
					isCapsLock = false;
					isNumLock = false;
				}
				bw.write("Case " + t + ": Wrong password.");
				if (isCapsLock && isNumLock)
					bw.write(" Please, check your caps lock and num lock keys.");
				else if (isCapsLock)
					bw.write(" Please, check your caps lock key.");
				else if (isNumLock)
					bw.write(" Please, check your num lock key.");
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}