
public class matHang {
    private String ma,ten,donVi;
    private int giaMua, giaBan;

    public matHang(int ma, String ten, String donVi, int giaMua, int giaBan) {
        this.ma = "MH" + String.format("%04d",ma);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public int getLoiNhuan() {
        return this.giaBan - this.giaMua;
    }
    
    public String getMa() {
        return this.ma;
    }
    
    public String toString() {
        return this.ma + " " + this.ten + " " + this.donVi + " " + this.giaMua + " " + this.giaBan + " " + this.getLoiNhuan();
    }
    
}
    

