import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int limit = 2000000;
		int[] prime = new int[limit];
		for (int i = 2; i < limit; i++) {
			prime[i] = i;
		}
		for (int i = 2; i < Math.sqrt(limit); i++) {
			if (prime[i] != 0) {
				for (int j = i + i; j < limit; j += i) {
					prime[j] = 0;
				}
			}
		}
		for (int i = 2; i < limit; i++) {
			if (prime[i] != 0 && i >= N && isPalindrome(i)) {
				bw.write(i + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}

	public static boolean isPalindrome(int num) {
		String str = Integer.toString(num);
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
			} else {
				return false;
			}
		}
		return true;
	}
}
