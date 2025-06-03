import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			String input = br.readLine();
			if (input.equals("0"))
				break;
			int j = input.length() - 1;
			boolean isPalindrome = true;
			for (int i = 0; i < input.length() / 2; i++) {
				if (input.charAt(i) != input.charAt(j)) {
					isPalindrome = false;
				}
				j--;
			}
			if (isPalindrome)
				bw.write("yes\n");
			else
				bw.write("no\n");
		}
		bw.flush();
		bw.close();
	}
}
