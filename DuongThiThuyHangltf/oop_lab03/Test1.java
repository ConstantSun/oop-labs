/**

* @author  Duong Thi Thuy Hang
* @version 1.0
* @since 18-9-2018

**/

import java.util.*;
import java.io.*;
class Test1 {
	public static void ucln(int a,int b) {  // Tim ucln cua a va b.
		int x,y,tem;
		x=(a>0)?a:-a; // x = abs(a)
		y=(b>0)?b:-b; // y = abs(b)
		a=(x>y)?x:y;  // a=max(x,y)
		b=x+y-a;      // b= min(x,y)
		if (a==0 && b==0) {
			System.out.println("Ko ton tai ucln");
			return;
		};
		if (b==0) {
			System.out.println(a);
			return;
		};
		while(true) { // su dung thuat toan Oclit de tim ucln
			a=a%b;
			tem=a;a=b;b=tem;
			if(b==0) {
				System.out.println(a);
				return;
			};
		}
		
	}
	public static void fibo(int n) { // Tim so fibonaci thu n.
		
		if(n==0) {
			System.out.println(0);
			return;
		};
		if (n==1) {
			System.out.println(1);
			return;
		};
		int a=0,b=1,c=0;
		while(n-1>0) {
			n--;
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		return; // 0 1 1 2 3 
	}
	public static void main(String[] args){
		ucln(-30,12);
		fibo(5);
	}
}