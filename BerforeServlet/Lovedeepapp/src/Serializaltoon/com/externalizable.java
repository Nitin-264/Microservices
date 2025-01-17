package Serializaltoon.com;
import java.io.*;

class Dog1 implements Externalizable{

	String name;
	int i;
	int j;
	Dog1(String name,int i,int j){
		this.i=i;
		this.name=name;
		this.j=j;
	}
	public Dog1() {
		System.out.println("Dog class Constructor");
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Wirting required serilizable object");
		out.writeObject(name);
		out.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Reading the writen objects ");
		name = (String)in.readObject();
		i= in.readInt();
	}
	
}
public class externalizable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

Dog1 d = new Dog1("Nitin",10,20);
		
System.out.println(d.name+"-----"+d.i+"-------"+d.j);
		
		 System.out.println("Serialization Started");
	        FileOutputStream fos = new FileOutputStream("dogg1.ser");
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeObject(d);
	        System.out.println("Serialization Completed");

	        System.in.read();
	        
	        
	        System.out.println("De-serialization Started");
	        FileInputStream fis = new FileInputStream("dogg1.ser");
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        Dog1 d2 = (Dog1)ois.readObject()
	        		;
	      
	        System.out.println(d2.name+"-----"+d2.i+"-------"+d2.j);
	}

}
