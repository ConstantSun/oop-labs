import java.util.*;
public class C4 extends C3 {
	public static void castExcept(C4 c) throws  ClassCastException {
		System.out.println(c.toString());
	}
	public static void main(String[] args) {
		try{
			C3 c = new C3();
			castExcept((C4)c);
		}
		catch(ClassCastException e){
			System.out.println(e.getMessage());
		}
	}
}