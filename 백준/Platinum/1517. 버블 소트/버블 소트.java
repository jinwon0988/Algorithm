import java.io.*;
import java.util.*;

public class Main {
	static long result = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		mergeSort(A, 0, N - 1);
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

	private static void mergeSort(int[] A, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(A, left, mid);
			mergeSort(A, mid + 1, right);
			merge(A, left, mid, right);
		}
	}

	private static void merge(int[] A, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];
		int i = left;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= right) {
			if (A[i] <= A[j]) {
				temp[k++] = A[i++];
			} else {
				temp[k++] = A[j++];
				result += mid - i + 1;
			}
		}
		while (i <= mid) {
			temp[k++] = A[i++];
		}

		while (j <= right) {
			temp[k++] = A[j++];
		}

		for (int t = 0; t < temp.length; t++) {
			A[left + t] = temp[t];
		}
	}
}
