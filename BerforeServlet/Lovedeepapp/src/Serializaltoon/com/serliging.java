package Serializaltoon.com;
import java.io.*;
class Dog implements Serializable{
	int i=10;
	int j=20;
	
}
class Cat implements Serializable{
	int i=100;
	int j=200;
}
public class serliging {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("*****Sreialization started*****");
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		FileOutputStream fos = new FileOutputStream("Obj.sre");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		System.out.println("*****Sreialization Completed*****");
		
		System.out.println("*****De-Sreialization Started*****");
		
		FileInputStream fis = new FileInputStream("Obj.sre");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		Cat c2 = (Cat)ois.readObject();
		System.out.println(d2.i+"    "+ d2.j);
		System.out.println(c2.i+"    "+ c2.j);
		System.out.println("*****De-Sreialization Completed*****");
				
		System.out.println("Monu daughter of Naveen Bhamboo");
		System.out.println("Gunu daughter of Sanjay Bhamboo");

		
		
	}

}
