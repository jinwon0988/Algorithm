import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		HashSet<Long> hs = new HashSet<>();
		for (long i : A) {
			hs.add(i);
		}
		ArrayList<Long> al = new ArrayList<>(hs);
		Collections.sort(al);
		HashMap<Long, Integer> hm = new HashMap<>();
		for (int i = 0; i < al.size(); i++) {
			hm.put(al.get(i), i);
		}
		for (int i = 0; i < A.length; i++) {
			bw.write(hm.get(A[i]) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
// -10 -9 2 4 4