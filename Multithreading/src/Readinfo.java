import java.io.*;
import java.util.Scanner;
public class Readinfo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("list.txt");
        System.out.println("File name:- "+f.getName());
        System.out.println("Is file or not:-"+f.isFile());
        System.out.println("Is Directory or not"+f.isDirectory());
        System.out.println("List or not "+f.list());
       // System.out.println(f.renameTo(new File("Raj.txt")));
        System.out.println("File name:- "+f.getName());
        System.out.println(f.mkdir());
        System.out.println("Hash code:- "+f.hashCode());
        System.out.println("Length is "+f.length());
        System.out.println("Can read the file "+f.canRead());
        System.out.println("Can write the file "+f.canWrite());
        System.out.println(f.toString());
//       System.out.println(f.createNewFile(new File("list.txt")));
//        boolean newFile = f.createNewFile("list.txt");
 //       File f1=new File(f,"Rohan.txt");
        FileWriter fr=new FileWriter("mahesh.txt");
        fr.write("Hello beautiful world!!!");
        fr.close();
        File f1=new File("mahesh.txt");
        System.out.println("Compair method "+f.compareTo(f1));
        System.out.println(f.equals(f1));
        FileReader fr1=new FileReader("mahesh.txt");
        Scanner sc=new Scanner(fr1);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
       
        System.out.println(f.equals(f1));
//        f1.mkdir();
//        System.out.println(f1.);
//        System.out.println(f.compareTo());
	}

}
