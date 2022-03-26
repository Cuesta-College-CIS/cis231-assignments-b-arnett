import java.util.Scanner;

public class Lab522edited {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int N1 = scnr.nextInt();
		int[] num1 = new int[N1];
		for (int i = 0; i < N1; i++)
			num1[i] = scnr.nextInt();

		int N2 = scnr.nextInt();
		int[] num2 = new int[N2];
		for (int i = 0; i < N2; i++)
			num2[i] = scnr.nextInt();

		int flag = 0;
		int n1c = 0;
		int n2c = 0;
		int[] result = new int[N1 + N2];
		// Add one line to find the min length;
		int min_len = (N1 < N2) ? N1 : N2;
		for (int i = 0; i < result.length; i++) {
			// edited the condition min_len * 2
			if (i < min_len * 2) {
				if ((i % 2 == 0) && n1c < N1) {
					result[i] = num1[n1c];
					n1c++;
				} else {
					if (n2c < N2) {
						result[i] = num2[n2c];
						n2c++;
					}
				}
			} else {
				if (min_len == num1.length) {
					for (int j = 0; j < N2 - N1; j++)
						result[j + N1 * 2] = num2[j + N1];
				} else {
					for (int j = 0; j < N1 - N2; j++)
						result[j + N2 * 2] = num1[j + N2];
				}
			}

		}

		for (int v : result)
			System.out.print(v + " ");
		System.out.println();
		scnr.close();
	}

}
