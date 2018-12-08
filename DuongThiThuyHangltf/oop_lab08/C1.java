import java.util.*;
public class C1 {
	public static void indexOutOfBound() throws  IndexOutOfBoundsException{
		ArrayList<C1> array = new ArrayList<>();
		System.out.println(array.get(0).toString());
	}
	public static void main(String[] args) {
		try{
			indexOutOfBound();
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("index out of bound !!!");
		}
	}
}