import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			boolean[] isExisted = new boolean[26];
			boolean isRight = true;
			isExisted[input.charAt(0) - 97] = true;
			for (int j = 1; j < input.length(); j++) {
				char ch = input.charAt(j);
				if (!isExisted[input.charAt(j) - 97])
					isExisted[input.charAt(j) - 97] = true;
				else {
					if (input.charAt(j - 1) != ch) {
						isRight = false;
						break;
					}
				}
			}
			if (isRight)
				count++;
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}