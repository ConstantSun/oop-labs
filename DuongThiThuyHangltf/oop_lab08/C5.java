import java.io.*;
import java.util.*;
public class C5 {
	public static void ioExcept() throws  IOException {
		File f = new File("oop.txt");
		Scanner sc = new Scanner(f);

	}
	public static void main(String[] args) {
		try{
			ioExcept();
		}
		catch(IOException e){
			System.out.println("khong doc duoc file");
		}
		
	}
}