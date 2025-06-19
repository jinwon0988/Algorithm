import java.io.*;
import java.util.*;

public class Main {
	static int[] B;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		int index;
		B = new int[N + 1];
		int maxLength = 0;
		B[++maxLength] = A[1];
		int[] D = new int[N + 1];
		D[1] = 1;
		for (int i = 2; i <= N; i++) {
			if (B[maxLength] < A[i]) {
				B[++maxLength] = A[i];
				D[i] = maxLength;
			} else {
				index = binarysearch(1, maxLength, A[i]);
				B[index] = A[i];
				D[i] = index;
			}
		}
		bw.write(maxLength + "\n");
		index = maxLength;
		int x = B[maxLength] + 1;
		int[] answer = new int[N + 1];
		for (int i = N; i >= 1; i--) {
			if (D[i] == index && A[i] < x) {
				answer[index] = A[i];
				x = A[i];
				index--;
			}
		}
		for (int i = 1; i <= maxLength; i++)
			bw.write(answer[i] + " ");
		bw.flush();
		bw.close();
		br.close();
	}

	static int binarysearch(int l, int r, int now) {
		int mid;
		while (l < r) {
			mid = (l + r) / 2;
			if (B[mid] < now)
				l = mid + 1;
			else
				r = mid;
		}
		return l;
	}
}
