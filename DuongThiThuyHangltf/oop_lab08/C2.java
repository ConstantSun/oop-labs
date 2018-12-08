import java.util.*;
public class C2 {
	public static void nullP(Object o) throws  NullPointerException
	{
		// if(o == null){
		// 	throw new NullPointerException();
		// }
		System.out.println(o.toString());
	}
	public static void main(String[] args) {
		try{
			nullP(null);
		}
		catch(NullPointerException e){
			System.out.println("Null pointer exception made");
		}
		
	}
}