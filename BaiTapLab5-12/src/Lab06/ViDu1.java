package Lab06;

import java.util.ArrayList;

public class ViDu1 {
	public static void main(String[] args) {
//		System.out.print("Nhập username: ");
//		Scanner scanner = new Scanner(System.in);
//		String username = scanner.nextLine();
//
//		System.out.print("Nhập password: ");
//		String password = scanner.nextLine();
//		System.out.println("username = " + username + " password = " + password);
//		if (username.equals("huykhang") && password.length() > 6) {
//			System.out.println("Oke right");
//		}

		Student st1 = new Student("Hoi dan it", "001");
		Student st2 = new Student("Nguyễn Huy Khang", "002");
		Student st3 = new Student("Nguyễn Văn A", "003");
		Student st4 = new Student("Trần Thị B", "004");
		Student st5 = new Student("Hà Văn C", "005");

		ArrayList<Student> arr = new ArrayList();
		arr.add(st5);
		arr.add(st4);
		arr.add(st3);
		arr.add(st2);
		arr.add(st1);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyễn")) {
				System.out.println(arr.get(i));
			}
		}

	}
}
