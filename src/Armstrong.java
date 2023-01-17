import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int num = sc.nextInt();
		int digit, sum = 0;
		int number = num;

		while (num != 0) {
			digit = num % 10;
			sum = sum + digit * digit * digit;
			num = num / 10;
		}

		if (number == sum) {
			System.out.println(number + " Number is armstrong");
		} else {
			System.out.println(number + " Number is not armstrong");
		}
	}
}
