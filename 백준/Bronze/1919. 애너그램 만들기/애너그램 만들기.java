import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] alpha1 = new int[26];
		int[] alpha2 = new int[26];
		char[] input1 = br.readLine().toCharArray();
		char[] input2 = br.readLine().toCharArray();
		for (int i = 0; i < input1.length; i++) {
			alpha1[input1[i] - 'a']++;
		}
		for (int i = 0; i < input2.length; i++) {
			alpha2[input2[i] - 'a']++;
		}
		int sum = 0;
		for (int i = 0; i < 26; i++) {
			if (alpha1[i] > alpha2[i])
				sum += alpha1[i] - alpha2[i];
			else if (alpha1[i] < alpha2[i])
				sum += alpha2[i] - alpha1[i];
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}