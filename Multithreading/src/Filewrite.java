import java.io.*;
public class Filewrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
	           FileWriter fw=new FileWriter("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt");    
	           fw.write("Welcome to this world!!");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Successfully written...");    
	}

}
