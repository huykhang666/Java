package TinhThue;

import java.util.Scanner;

public class TinhThue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số tiền thuế");
		int thue = scanner.nextInt();
		if (thue > 30) {
			System.out.println("Thuế 50%");
		} else if (thue >= 15 && thue <= 30) {
			System.out.println("Thuế 20%");
		} else if (thue >= 10 && thue <= 15) {
			System.out.println("Thuế 10%");
		} else {
			System.out.println("Không đóng thuế");
		}
	}
}
