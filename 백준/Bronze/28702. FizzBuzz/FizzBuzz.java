import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = 0, index = 0;
		for (int i = 0; i < 3; i++) {
			String str = br.readLine();
			if (!str.equals("Fizz") && !str.equals("Buzz") && !str.equals("FizzBuzz")) {
				num = Integer.parseInt(str);
				index = i;
			}
		}
		num += 3 - index;
		if (num % 3 == 0 && num % 5 != 0)
			bw.write("Fizz\n");
		else if (num % 3 != 0 && num % 5 == 0)
			bw.write("Buzz\n");
		else if (num % 15 == 0)
			bw.write("FizzBuzz\n");
		else
			bw.write(num + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}