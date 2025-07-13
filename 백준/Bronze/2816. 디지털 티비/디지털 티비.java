import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] A = new String[N];
		for (int i = 0; i < N; i++) {
			A[i] = br.readLine();
		}
		int index = 0;
		while (true) {
			if (A[index].equals("KBS1")) {
				break;
			} else {
				bw.write("1");
				index++;
			}
		}
		String[] B = new String[N];
		B[0] = A[index];
		for (int i = 1, j = 0; i < N; i++) {
			if (j == index)
				j++;
			B[i] = A[j];
			j++;
		}
		while (true) {
			if (index == 0) {
				break;
			} else {
				bw.write("4");
				index--;
			}
		}
		while (true) {
			if (B[index].equals("KBS2")) {
				break;
			} else {
				bw.write("1");
				index++;
			}
		}
		while (true) {
			if (index == 1) {
				break;
			} else {
				bw.write("4");
				index--;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}