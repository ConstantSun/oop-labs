import java.io.*;
import java.util.*;
public class C6 {
	public static void ioExcept() throws  FileNotFoundException 
	{
		File f = new File("oop.txt");
		Scanner sc = new Scanner(f);
	}
	public static void main(String[] args) {
		try{
			ioExcept();
		}
		catch(FileNotFoundException e){
			System.out.println("khong tim thay file");
		}
		
	}
}