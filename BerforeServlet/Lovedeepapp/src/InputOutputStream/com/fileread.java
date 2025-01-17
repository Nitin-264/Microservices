package InputOutputStream.com;
import java.io.*;
public class fileread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f =new File("D:\\Lovedeepapp\\Rohit\\nitin.txt");
		FileReader fr = new FileReader(f);
		//First Approach
		
		/*int i=fr.read();
		while(i!=-1) {
			System.out.println((char)i);
			i=fr.read();
		}*/
		
		//second approach
		
		char arr[] = new char[(int)f.length()];
		System.out.println("Totall no of char in file is"+f.length());
		
		int no = fr.read(arr);
		System.out.println(no);
		
		for(char data:arr) {
			System.out.println(data);
		}
		
		fr.close();
	}

}
