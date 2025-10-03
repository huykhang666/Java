
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<matHang> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            matHang mh = new matHang(i+1, sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt());
            arr.add(mh);
        }
        
        Collections.sort(arr, new Comparator<matHang>(){
            @Override
            public int compare(matHang o1, matHang o2) {
               if(o1.getLoiNhuan() != o2.getLoiNhuan()) {
                   return o2.getLoiNhuan() - o1.getLoiNhuan();
               } else {
                   return o1.getMa().compareTo(o2.getMa());
                }
            }
        });
        
        for(matHang x : arr) {
            System.out.println(x);
        }
    }
}

