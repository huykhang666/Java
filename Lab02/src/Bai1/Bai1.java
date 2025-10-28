package Bai1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Phương trình có dạng ax + b");
		System.out.println("Nhập a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập b: ");
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.println("Kết quả x = " + x);
		}
	}
}
