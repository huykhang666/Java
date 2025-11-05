package Lab07;

public class BaiTapLab07 {
	public static void main(String[] args) {
		System.out.println("Run lab07");
		System.out.println("Sinh Vien IT");
		SinhVien it1 = new SinhVienIT(10, 9);
		System.out.println("Score:" + it1.getScore());

		System.out.println("Sinh Vien Co Khi");
		SinhVien ck1 = new SinhVienCoKhi(10, 10);
		System.out.println("Score: " + ck1.getScore());
	}
}
