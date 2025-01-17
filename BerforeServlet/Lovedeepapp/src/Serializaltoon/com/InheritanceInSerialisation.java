package Serializaltoon.com;
import java.io.*;

abstract class Animal{
	int i=10;
	Animal(){
		System.out.println("Animal class Constructor");
	}
}
class Dog extends Animal implements Serializable{

	int j=20;
	Dog(){
		System.out.println("Dog class Constructor");
	}
}
public class InheritanceInSerialisation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		
		d.i=888;
		d.j=999;
		
		 System.out.println("Serialization Started");
	        FileOutputStream fos = new FileOutputStream("dogg.ser");
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeObject(d);
	        System.out.println("Serialization Completed");

	        System.in.read();
	        
	        
	        System.out.println("De-serialization Started");
	        FileInputStream fis = new FileInputStream("dogg.ser");
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        Dog d2 = (Dog)ois.readObject()
	        		;
	      
	        System.out.println(d2.i+"-------"+d2.j);
	        
	}

}

