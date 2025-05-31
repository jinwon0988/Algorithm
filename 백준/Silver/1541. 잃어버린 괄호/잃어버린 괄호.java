import java.io.*;

public class Main {
	static int answer = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String example = br.readLine();
		String[] str = example.split("-");
		for (int i = 0; i < str.length; i++) {
			int num = sum(str[i]);
			if (i == 0)
				answer += num;
			else
				answer -= num;
		}
		bw.write(answer + "\n");
		bw.flush();
		bw.close();
	}

	public static int sum(String s) {
		int sum = 0;
		String[] str = s.split("[+]");
		for (int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		return sum;
	}
}
