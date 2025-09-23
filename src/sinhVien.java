
import java.util.Scanner;


public class sinhVien {
    //Thuộc tính
    private String name;
    private String birth;
    private double gpa_1,gpa_2,gpa_3;
    //Phương thức
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ho ten: ");
        name = sc.nextLine();
        
        System.out.println("Nhap ngay sinh: ");
        birth = sc.nextLine();
        
        System.out.println("Nhap diem mon 1: ");
        gpa_1 = sc.nextDouble();
        
        System.out.println("Nhap diem mon 2: ");
        gpa_2 = sc.nextDouble();
        
        System.out.println("Nhap diem mon 3: ");
        gpa_3 = sc.nextDouble();
               
    }
    
     public void xuat() {
        System.out.println("\n--- Thong tin thi sinh ---");
        System.out.println("Ho ten: " + name);
        System.out.println("Ngay sinh: " + birth);
        System.out.println("Diem mon 1: " + gpa_1);
        System.out.println("Diem mon 2: " + gpa_2);
        System.out.println("Diem mon 3: " + gpa_3);
        System.out.println("Tong diem: " + (gpa_1 + gpa_2 + gpa_3));
    }
}
   