package com.studyopedia;

class Popcorn{
	public void taste() {
		System.out.println("Spicy");
		
	}
}
public class AnamonusInnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Popcorn p =new Popcorn(){
			@Override
			public void taste() {
				System.out.println("Salty");
				
			}
			
			public void Brand() {
				System.out.println("MacD");
				
			}
			
		};
		
		
		p.taste();
		//p.Brand();  using parennt reference we cannot call child class method 
		
		Popcorn p1 = new Popcorn();
		p1.taste();
	}

}
