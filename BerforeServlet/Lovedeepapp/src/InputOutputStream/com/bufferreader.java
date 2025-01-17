package InputOutputStream.com;
import java.io.*;
public class bufferreader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader bw = new BufferedReader(new FileReader("Nitin.txt"));
		
	String line =	bw.readLine();
	while(line!=null){
		System.out.println(line);
		line = bw.readLine();
	}
		
		bw.close();

}
}