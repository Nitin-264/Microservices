package collection.com;

class person{
	
	String name;
	int age;
	
	person(String name,int age){
		this.age=age;
		this.name=name;
		
	}
	@Override
	public int hashCode(){
		return name.hashCode()+age;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		else if(obj instanceof person) {
			person p =(person) obj;
			if(name.equals(p.name)&& name.equals(p.age)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person p1 =new person("sachin",50);
		person p2 = new person("sachin",50);
		System.out.println(p1==p2);
		System.out.println(p1.hashCode()==p2.hashCode());
		System.out.println(p1.equals(p2));
	}

}
