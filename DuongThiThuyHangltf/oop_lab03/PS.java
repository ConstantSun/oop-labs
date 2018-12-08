/**

* @author  Duong Thi Thuy Hang
* @version 1.0
* @since 18-9-2018

**/

import java.util.*;
import java.io.*;
class PS {
    public int tu; // tu so
    public int mau; // mau so
    public PS(int tu, int mau) {  // ham khoi tao voi tham so tu, mau
        this.tu = tu;
        this.mau = mau;
    };
	
	
    public PS plus(PS p) {  // method cong this voi phan so p
        PS result = new PS(1,1) ;
        result.tu = this.tu*p.mau + this.mau*p.tu;
        result.mau = this.mau*p.mau;
        return result;
    };

    public PS minus(PS p) { // method tru this voi phan so p
        PS result = new PS(1,1) ;
        result.tu = this.tu*p.mau - this.mau*p.tu;
        result.mau = this.mau*p.mau;
        return result;
    };

    public PS times(PS p) { // method nhan this voi phan so p
        PS result = new PS(1,1) ;
        result.tu = this.tu*p.tu ;
        result.mau = this.mau*p.mau;
        return result;
    };

    public PS divides(PS p) { // method chia this cho phan so p
        PS result = new PS(1,1) ;
        result.tu = this.tu*p.mau ;
        result.mau = this.mau*p.tu;
        return result;
    };

    public boolean equals(PS obj) { // method so sanh 2 phan so la this voi obj
        return (this.tu*obj.mau - this.mau*obj.tu == 0);
    }

    public static void main(String[] args) {
        PS p1 = new PS(2,3);
        PS p2 = new PS(1,3);
        System.out.println("p1+p2 = " + p1.plus(p2).tu + "/" + p1.plus(p2).mau );
		System.out.println("p1-p2 = " + p1.minus(p2).tu + "/" + p1.plus(p2).mau );
		System.out.println("p1*p2 = " + p1.times(p2).tu + "/" + p1.plus(p2).mau );
		System.out.println("p1/p2 = " + p1.divides(p2).tu + "/" + p1.plus(p2).mau );
    }
};