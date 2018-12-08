/**@author Duong Thi Thuy Hang
 * @since   2nd 10 2019
 * @version  0.1
 */


/**
 * @param giaBan_1can,mauSac,nguonGocXuatXu,ngayNhap,soLuong
 * @method setter,getter, toString
 */

class HoaQua {
    protected double giaBan_1can;
    protected String mauSac;
    protected String nguonGocXuatXu;
    protected String ngayNhap;
    protected int soLuong;


    public HoaQua(){
        giaBan_1can = 0;
        mauSac = "xanh";
        nguonGocXuatXu ="VietNam";
        ngayNhap = "01/01/2000";
        soLuong = 0;
    }

    @Override
    public String toString() {
        System.out.println("Hoa qua:  gia 1 can:"+ giaBan_1can+
                "  ;mau sac: " + mauSac +
                " ;Xuat xu: " + nguonGocXuatXu +
                " ;ngay nhap: " + ngayNhap +
                " ;so luong: " + soLuong
                );
        return " ";
    }

    /**
     *
     * @return mau sac;
     */
    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getNguonGocXuatXu() {
        return nguonGocXuatXu;
    }

    public void setNguonGocXuatXu(String nguonGocXuatXu) {
        this.nguonGocXuatXu = nguonGocXuatXu;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan_1can() {
        return giaBan_1can;
    }

    public void setGiaBan_1can(double giaBan_1can) {
        this.giaBan_1can = giaBan_1can;
    }
}

/**
 * @param giaBan_1can,mauSac,nguonGocXuatXu,ngayNhap,soLuong, soMuiTrungBinh
 * @method setter,getter, toString
 */
class QuaCam extends HoaQua {
    protected int soMuiTrungBinh;
    public QuaCam(){
        soMuiTrungBinh = 8;
    }
    public int getSoMuiTrungBinh() {
        return soMuiTrungBinh;
    }

    public void setSoMuiTrungBinh(int soMuiTrungBinh) {
        this.soMuiTrungBinh = soMuiTrungBinh;
    }

    @Override
    public String toString() {
        System.out.println( " qua cam :  gia 1 can:"+ giaBan_1can+
                "  ;mau sac: " + mauSac +
                " ;Xuat xu: " + nguonGocXuatXu +
                " ;ngay nhap: " + ngayNhap +
                " ;so luong: " + soLuong +
                " ; so mui tb: " + soMuiTrungBinh
        );
        return " ";
    }

}

/**
 * @param giaBan_1can,mauSac,nguonGocXuatXu,ngayNhap,soLuong, mucDoNgot
 * @method getter setter, toString
 */
class QuaTao extends HoaQua {
    protected String mucDoNgot;
    public QuaTao(){
        mucDoNgot = "trung binh";
    }

    public String getMucDoNgot() {
        return mucDoNgot;
    }

    public void setMucDoNgot(String mucDoNgot) {
        this.mucDoNgot = mucDoNgot;
    }

    @Override
    public String toString() {
        System.out.println("Qua Tao:  gia 1 can:"+ giaBan_1can+
                "  ;mau sac: " + mauSac +
                " ;Xuat xu: " + nguonGocXuatXu +
                " ;ngay nhap: " + ngayNhap +
                " ;so luong: " + soLuong +
                " ;muc do ngot : " + mucDoNgot
        );
        return " ";
    }
}

/**
 * @param giaBan_1can,mauSac,nguonGocXuatXu,ngayNhap,soLuong,soMuiTrungBinh
 * @method getter ,setter, toString
 */
class CamCaoPhong extends QuaCam {
    public CamCaoPhong(){
        nguonGocXuatXu ="Hoa Binh";
    }

    @Override
    public String toString() {
        System.out.println("Cam cao phong:  gia 1 can:"+ giaBan_1can+
                "  ;mau sac: " + mauSac +
                " ;Xuat xu: " + nguonGocXuatXu +
                " ;ngay nhap: " + ngayNhap +
                " ;so luong: " + soLuong
        );
        return " ";
    }
}

/**
 * @param giaBan_1can,mauSac,nguonGocXuatXu,ngayNhap,soLuong,soMuiTrungBinh
 * @method getter setter, toString
 */
class CamSanh extends QuaCam {
    public CamSanh(){
        soMuiTrungBinh = 12;
    }

    @Override
    public String toString() {
        System.out.println("Cam sanh:  gia 1 can:"+ giaBan_1can+
                "  ;mau sac: " + mauSac +
                " ;Xuat xu: " + nguonGocXuatXu +
                " ;ngay nhap: " + ngayNhap +
                " ;so luong: " + soLuong+
                " ; so mui tb: " + soMuiTrungBinh
        );
        return " ";
    }
}


public class WeekFive {
    public static void main(String[] args) {
        HoaQua hoaQua = new HoaQua();
        QuaCam quaCam = new QuaCam();
        QuaTao quaTao = new QuaTao();
        CamCaoPhong camCaoPhong = new CamCaoPhong();
        CamSanh camSanh = new CamSanh();

        //String a="";
        hoaQua.toString();
        quaCam.toString();
        quaTao.toString();
        camCaoPhong.toString();
        camSanh.toString();
    }
}