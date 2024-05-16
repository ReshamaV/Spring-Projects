import java.io.*;
import java.util.Scanner;
public class Fileread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt");
				 //Path of file name
				 Scanner sc=new Scanner(f);
				 while(sc.hasNextLine())
				 {
				 System.out.println(sc.nextLine());
				 }
	}

}
