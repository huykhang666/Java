package Bai02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		int length = scanner.nextInt();
		System.out.println("Nhập chiều rộng: ");
		int width = scanner.nextInt();

		int chuVi = (length + width) * 2;
		int dienTich = length * width;
		int canhMin = Math.min(chuVi, dienTich);

		System.out.println("Chu vi hình chữ nhật là: " + chuVi + "\nDiện tích hình chữ nhật là: " + dienTich
				+ "\n Cạnh nhỏ nhất là: " + canhMin);
	}
}
