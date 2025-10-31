package Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> arrNumber = new ArrayList<Double>();

		while (true) {
			System.out.print("Nhập vào số thực bất kì: ");
			double input = scanner.nextDouble();
			arrNumber.add(input);
			scanner.nextLine();

			System.out.print("Nhập Y or N: ");
			String option = scanner.nextLine();
			if (option.equals("n") || option.equals("N")) {
				break;
			}
		}

		System.out.println("Check array: " + arrNumber);
		double sum = 0;
		for (int i = 0; i < arrNumber.size(); i++) {
			sum += arrNumber.get(i);
		}

		System.out.println("Tổng mảng : " + sum);
	}
}
