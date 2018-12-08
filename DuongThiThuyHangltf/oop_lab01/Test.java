/**
 * @author Duong Thi Thuy Hang
 * @version 1.8
 * @2018-09-16
 */

public class Test {
    /**
     * Tim ucln cua 2 so nguyen
     * @param x : first num
     * @param y :2nd num
     * @return ucln cua x,y
     */
    public  static  int UCLN(long x, long y){
        x = Math.abs(x);
        y = Math.abs(y);
        while(x != y){
            if(x > y){
                x = x - y;
            }
            if(x < y){
                y = x - y;
            }
        }
        return x;
    }

    /**
     * Tim so fibonacci thu n
     * @param n : vi tri so fibonacci phai tim
     * @return: fibonacci thu n
     */
    public static  int fibonaci(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        else{ // goi de quy
            return fibonaci(n-1) + fibonaci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(UCLN(5, -2));
        for(int i = 0; i < 10; i ++){
            System.out.print(fib(i) +  " ");
        }
    }
}
