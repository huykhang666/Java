
public class hocSinh {
    private String ma,hoTen;
    private double[] diem;

    public hocSinh(int ma,String hoTen, double[] diem) {
        this.ma = "HS" + String.format("%02d", ma);
        this.hoTen = hoTen;
        this.diem = new double[10];
        for(int i=0;i<10;i++) {
            this.diem[i] = diem[i];
        }
    }
    
    public double getTrungBinh() {
        double res = 0;
        for(int i = 0;i < 10;i++) {
            res += this.diem[i];
        }
        return res/10;
    }
    
    public String toString() {
        String result = "";
        double trungBinh = this.getTrungBinh();
        if(trungBinh >= 9) result = "Xuat Sac";
        else if(trungBinh >= 8) result = "Gioi";
        else if(trungBinh >= 7) result = "Kha";
        else if(trungBinh >=5) result = "Trung binh";
        else result = "Yeu";
        return this.ma + " " + this.hoTen + " " + String.format("%.1f", getTrungBinh()) + " " + result;
    }
}
