import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean asc = true, desc = true;
		for (int i = 1; i <= 8; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num != i)
				asc = false;
			if (num != (9 - i))
				desc = false;
		}
		if (asc)
			bw.write("ascending");
		else if (desc)
			bw.write("descending");
		else
			bw.write("mixed");
		bw.flush();
		bw.close();
	}
}
