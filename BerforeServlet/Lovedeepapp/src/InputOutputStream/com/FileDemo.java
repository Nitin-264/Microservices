package InputOutputStream.com;
import java.io.*;
public class FileDemo{

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		
		File f2 =new File("D:\\Lovedeepapp\\Rohit","MI.txt");
		f2.createNewFile()
;		
		System.out.println(f2.exists());
		
	}

}
