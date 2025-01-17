package com.studyopedia;

final class immutable {
	private int i;
	immutable(int i){
		this.i=i;
	}
	
	public immutable modify(int i) {
		
		if(this.i ==i) {
			return this ;
		}
		
		else {
			return new immutable(i);
		}
	}
	
}
public class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		immutable c1= new immutable(10);
		immutable c2 = c1.modify(10);
		immutable c3 = c2.modify(20);
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		System.out.println(c2==c3);
		
		immutable c4 = c1.modify(10);
		System.out.println(c4==c2);
	}

}
