import java.util.Scanner;

public class Lab523 {
	public static void main(String[] args) {
		int flag;
		final int N = 20;
		String[] words = new String[N];

		Scanner scnr = new Scanner(System.in);
		String key = scnr.next();
		int cnt = scnr.nextInt();

		for (int i = 0; i < cnt; i++) {
			words[i] = scnr.next();
		}
		flag = 0;
		for (int i = 0; i < cnt; i++) {
			if (key.equals(words[i])) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println(true);
		else
			System.out.println(false);

	}
}
