package InputOutputStream.com;
import java.io.*;
public class copycontent2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		PrintWriter out = new PrintWriter(new FileWriter("Output2.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("Nitin.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("Ask.txt"));
		
		String line = br1.readLine();
		String line1 = br2.readLine();
		while(line!=null | line1!=null) {
			if(line!=null) {
			out.println(line);
			line= br1.readLine();
			}
			
		if(line1!=null) {
			out.println(line1);
			line1= br2.readLine();
		}
		}
		
		out.flush();
		out.close();
		br1.close();
		br2.close();
		
	}

}
