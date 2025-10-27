package Bai01;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.println("Nhập điểm: ");
		int gpa = scanner.nextInt();
		System.out.println(name + " có điểm " + gpa);
	}
}
