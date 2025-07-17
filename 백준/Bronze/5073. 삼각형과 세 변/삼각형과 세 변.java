import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[] A = new int[3];
		while (true) {
			st = new StringTokenizer(br.readLine());
			A[0] = Integer.parseInt(st.nextToken());
			A[1] = Integer.parseInt(st.nextToken());
			A[2] = Integer.parseInt(st.nextToken());
			if (A[0] == 0 && A[1] == 0 && A[2] == 0)
				break;
			Arrays.sort(A);
			if (A[0] + A[1] <= A[2])
				bw.write("Invalid\n");
			else if (A[0] == A[1] && A[1] == A[2])
				bw.write("Equilateral\n");
			else if (A[0] == A[1] || A[1] == A[2])
				bw.write("Isosceles\n");
			else
				bw.write("Scalene\n");
		}
		bw.close();
		br.close();
	}
}