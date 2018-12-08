/**
 * @author Duong Thi Thuy Hang
 * @version 0.1
 * @2018-09-16
 */

class PS{
    private int tuso = 1;
    private int mauso = 1;

    public PS(){
        tuso=2;
        mauso=3;
    }

    /**
     * @param tu: tu so,
     * @param mau: mau so
     */
    public  PS(int tu, int mau){
        this.tuso = tu;
        this.mauso = mau;
    }
//
//    /**
//     * Tim ucln cua 2 so nguyen
//     * @param x : first num
//     * @param y :2nd num
//     * @return ucln cua x,y
//     */
//
//    public  static  int UCLN(long x, long y){
//        x = Math.abs(x);
//        y = Math.abs(y);
//        while(x != y){
//            if(x > y){
//                x = x - y;
//            }
//            if(x < y){
//                y = x - y;
//            }
//        }
//        return x;
//    }
    /**
     * @param b : phan so duoc cong.
     * @return ket qua cong 2 phan so
     */
    public PS cong(PS b){
        PS result = new PS();
        result.tuso = this.tuso*b.mauso + this.mauso*b.tuso;
        result.mauso = this.mauso*b.mauso;
        return result;
    }

    /**
     * @param b bieu dien phan so b
     * @return ket qua : tru 2  phan so
     */
    public PS tru(PS b){
        PS result = new PS();
        result.tuso = this.tuso*b.mauso - this.mauso*b.tuso;
        result.mauso = this.mauso*b.mauso;
        return result;
    }

    /**
     * @param b bieu dien phan so b
     * @return ket qua : nhan 2 phan so
     */
    public PS nhan(PS b){
        PS result = new PS();
        result.tuso = this.tuso*b.tuso;
        result.mauso = this.mauso*b.mauso;
        return result;
    }

    /**
     * @param b
     * @return ket qua :chia 2 phan so
     */
    public PS chia(PS b){
        PS result = new PS();
        result.tuso = this.tuso*b.mauso;
        result.mauso = this.mauso*b.tuso;
        return result;
    }

    /**
     * @param b
     * @return True if 2 phan so bang nhau , false: con lai.
     */
    public boolean equals(PS b){
        return (this.tru(b) == 0);
    }

    public int getTuso() {
        return this.tuso;
    }
    public int getMauso(){
        return this.mauso;
    }

}

public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        PS a = new PS(10,8);
        PS b = new PS(71,4);
        PS t = new PS(0,20);
        t = a.nhan(b);
        System.out.print(t.getTuso() + "/" + t.getMauso());
    }
}

