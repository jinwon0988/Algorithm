import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		while ((input = br.readLine()) != null && !input.isEmpty()) {
			String result = "";
			for (int i = 0; i < input.length(); i++) {
				String str = input.substring(i, i + 1);
				switch (str) {
				case "i":
					str = "e";
					break;
				case "e":
					str = "i";
					break;
				case "I":
					str = "E";
					break;
				case "E":
					str = "I";
					break;
				}
				result += str;
			}
			bw.write(result + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}