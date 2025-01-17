package InputOutputStream.com;
import java.io.*;
public class bufferedwriter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedWriter bw = new BufferedWriter(new FileWriter("Nitin.txt"));
		bw.write(97);
		bw.newLine();
		bw.write("nitin");
		bw.newLine();
		
		char ch[] ={'p','w','s','k','i','l','l','s'};
		bw.write(ch);
		bw.flush();
		bw.close();

}
}