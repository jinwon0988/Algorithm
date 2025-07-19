import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		HashSet<String> hs = new HashSet<>(Arrays.asList("Give you up", "Let you down", "Run around and desert you",
				"Make you cry", "Say goodbye", "Tell a lie and hurt you"));
		if (hs.contains(input))
			System.out.println("NO");
		else
			System.out.println("YES");
		sc.close();
	}
}