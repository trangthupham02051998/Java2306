package com.company;

public class HocSinh implements TinhDiem{
    private String ten;
    private int diemToan;
    private int diemLy;
    private int diemHoa;

    @Override
    public String toString() {
        return "HocSinh{" +
                "ten='" + ten + '\'' +
                ", diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                '}';
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public int getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public int getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }

    public HocSinh(String ten, int diemToan, int diemLy, int diemHoa) {
        this.ten = ten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }


    @Override
    public double tinhDiemTrungBinh() {
        return 0;
    }
}
