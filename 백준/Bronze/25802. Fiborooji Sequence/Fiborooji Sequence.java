import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> A = new ArrayList<>();
		A.add(Integer.parseInt(st.nextToken()));
		A.add(Integer.parseInt(st.nextToken()));
		int i = 0, j = 1;
		while (true) {
			int n = (A.get(i++) + A.get(j++)) % 10;
			A.add(n);
			if (A.get(i) == A.get(0) && A.get(j) == A.get(1))
				break;
		}
		bw.write((j + 1) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}