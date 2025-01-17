package InputOutputStream.com;
import java.io.*;
public class Printwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PrintWriter out = new PrintWriter(new FileWriter("Ask.txt"));
		out.write(97);
		out.println(100);
		out.println('A');
		out.println(false);
		out.println("Nitin Watched india vs pakistan match");
		out.flush();
		out.close();
		
	}

}
