import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ACount = Integer.parseInt(st.nextToken());
		int BCount = Integer.parseInt(st.nextToken());
		HashSet<Integer> A = new HashSet<>();
		HashSet<Integer> B = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ACount; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < BCount; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (A.contains(num)) {
				A.remove(num);
			} else {
				B.add(num);
			}
		}
		bw.write((A.size() + B.size()) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}