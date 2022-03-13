import java.util.Scanner;

public class Lab520 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int idx, length, target, flag;
		int[] numbers = { 45, 20, 30, 35, 10 };

		flag = 0;
		target = scnr.nextInt();
		length = numbers.length;

		for (int k = 0; k < length; k++) {
			if (numbers[k] == target) {
				flag = k;
			}
		}

		// int[] numbers2 = new int[length - 1];
		// for (int j = 0; j < (length - 1); j++) {
		// if (j + 1 == flag) {
		// j++;
		// }
		// numbers2[j] = numbers[j + 1];

		// }
		int[] numbers2 = new int[length - 1];
		int offset = 0;
		for (int j = 0; j < (length - 1); j++) {
			if (numbers[j] == target) {
				offset = 1;
				continue;
			}
			numbers2[j] = numbers[j + offset];

		}
		for (int i = 0; i < numbers2.length; i++)
			System.out.print(numbers2[i] + " ");
		System.out.println();

		scnr.close();
	}

}
