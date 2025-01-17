package collection.com;

class cat{
	int i;
	cat(int i){
		this.i=i;
	}
}
class Dog implements Cloneable{
	int j;
	cat c;
	Dog(int j,cat c){
		this.j= j;
		this.c=c;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
	//Object class clone() is getting called :: Shallow Cloning
	//return super.clone();
		
		//DeepCloning
		cat c1 =new cat(c.i);
		Dog d1 =new Dog(j,c);
		
		return d1;
	}
}

public class ShallowClonig {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		cat c= new cat(10);
		Dog d = new Dog(20,c);
		Dog d1 = (Dog) d.clone();
		
		d1.j =999;
		d1.c.i=888;
		System.out.println(d.c.i+"  "+d.j);
		System.out.println(d1.c.i+"  "+d1.j);
	}

}
