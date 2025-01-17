package collection.com;

public class clone implements Cloneable {

	int i=10;
	int j=200;
	
	clone(){
		
		System.out.println("Constructor got called");
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub

		clone c1=new clone();
		clone c2 = (clone)c1.clone();
		c2.i=100;
		c2.j=2000;
		System.out.println(c1.hashCode()==c2.hashCode());
		System.out.println(c1.i +" "+ c1.j);
		
		//System.out.println(c1.hashCode()==c2.hashCode());
		System.out.println(c2.i +" "+ c2.j);
	}

}
