import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Data[] A = new Data[N];
		for (int i = 0; i < N; i++) {
			A[i] = new Data(i, Integer.parseInt(br.readLine()));
		}
		Arrays.sort(A, (o1, o2) -> Integer.compare(o1.value, o2.value));
		int max = 0;
		for (int i = 0; i < N; i++) {
			if (max < A[i].index - i) {
				max = A[i].index - i;
			}
		}
		bw.write((max + 1) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	static class Data {
		int index;
		int value;

		Data(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}
}
