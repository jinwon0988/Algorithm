import java.io.*;
import java.util.*;

public class Main {
	static int[] A, tmp;
	static long result;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		A = new int[N];
		tmp = new int[N];
		result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		mergeSort(0, N - 1);
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static void mergeSort(int s, int e) {
		if (e - s < 1)
			return;
		int m = s + (e - s) / 2;
		mergeSort(s, m);
		mergeSort(m + 1, e);
		for (int i = s; i <= e; i++)
			tmp[i] = A[i];
		int k = s;
		int index1 = s;
		int index2 = m + 1;
		while (index1 <= m && index2 <= e) {
			if (tmp[index1] > tmp[index2]) {
				A[k] = tmp[index2];
				result += index2 - k;
				k++;
				index2++;
			} else {
				A[k] = tmp[index1];
				k++;
				index1++;
			}
		}
		while (index1 <= m) {
			A[k] = tmp[index1];
			k++;
			index1++;
		}
		while (index2 <= e) {
			A[k] = tmp[index2];
			k++;
			index2++;
		}
	}
}