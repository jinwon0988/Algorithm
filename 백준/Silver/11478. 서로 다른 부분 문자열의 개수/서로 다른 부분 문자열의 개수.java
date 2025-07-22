import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = br.readLine();
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < S.length() - i; j++) {
				String str = S.substring(j, j + 1 + i);
				if (!hs.contains(str))
					hs.add(str);
			}
		}
		bw.write(hs.size() + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}