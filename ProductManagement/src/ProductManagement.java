public class ProductManagement {
    private String maSP;
    private String tenSP;
    private double gia;
    private String hangSanXuat;

    public ProductManagement() {
    }

    public ProductManagement(String maSanPham, String tenSanPham, double gia, String hangSanXuat) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.hangSanXuat = hangSanXuat;
    }

    public String getMaSanPham() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", gia=" + gia +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                '}';
    }
}