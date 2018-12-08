import java.util.*;
public class C3 {
	public static void arithExcept() throws  ArithmeticException {
		int r = 5/0;
	}
	public static void main(String[] args) {
		try{
			arithExcept();
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}