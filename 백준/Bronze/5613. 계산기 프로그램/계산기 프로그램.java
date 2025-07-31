import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = Integer.parseInt(br.readLine());
		while (true) {
			String op = br.readLine();
			if (op.equals("+"))
				result += Integer.parseInt(br.readLine());
			else if (op.equals("-"))
				result -= Integer.parseInt(br.readLine());
			else if (op.equals("*"))
				result *= Integer.parseInt(br.readLine());
			else if (op.equals("/"))
				result /= Integer.parseInt(br.readLine());
			else
				break;
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}