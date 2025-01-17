package InputOutputStream.com;
import java.io.*;
public class CountFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File f = new File("D:\\C Tutorials course");
		String info[] = f.list();
		
		int count =0;
		int folder=0;
		int total=0;
		
		
		for(String data:info) {
			File f1 = new File(f,data);
			
			if(f1.isFile()) {
				count++;
			}
			else {
				folder++;
			}
			total++;
			System.out.println(data);
		}
		System.out.println(count);
		System.out.println(folder);
		System.out.println(total);
		
		
		
	}

}
