import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] input = br.readLine().toCharArray();
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] <= 67)
				sum += 3;
			else if (input[i] <= 70)
				sum += 4;
			else if (input[i] <= 73)
				sum += 5;
			else if (input[i] <= 76)
				sum += 6;
			else if (input[i] <= 79)
				sum += 7;
			else if (input[i] <= 83)
				sum += 8;
			else if (input[i] <= 86)
				sum += 9;
			else
				sum += 10;
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}