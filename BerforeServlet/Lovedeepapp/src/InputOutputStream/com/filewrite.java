package InputOutputStream.com;
import java.io.*;
public class filewrite {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("D:\\Lovedeepapp\\Rohit\\nitin.txt",true);
		fw.write(97);
		fw.write("\n");
		fw.write("nitin");
		fw.flush();
		
		char arr[] = {'p','w','s','k','i','l','l','s'};
		fw.write(arr);
		fw.flush();
		fw.close();
		
	}

}
