
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<hocSinh> arr = new ArrayList<>();
        for(int i = 0;i<n;i++) {
            String hoTen = sc.nextLine();
            double[] tmp = new double[10];
            for(int j=0;j<10;j++) {
                tmp[j] = sc.nextDouble();
            }
            sc.nextLine();
            hocSinh hs = new hocSinh(i+1,hoTen,tmp);
            arr.add(hs);
        }
        
        Collections.sort(arr, new Comparator<hocSinh>() {
            @Override
            public int compare(hocSinh o1, hocSinh o2) {
                if(o2.getTrungBinh() > o1.getTrungBinh()) return 1;
                else if(o2.getTrungBinh() < o1.getTrungBinh()) return -1;
                else return 0;
             }   
        });
        
        for(hocSinh x: arr) {
            System.out.println(x);
        }
    }
}

