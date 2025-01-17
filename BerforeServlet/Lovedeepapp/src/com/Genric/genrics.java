package com.Genric;
class gen<T>{
	T obj;
	gen(T obj){
		this.obj=obj;
	}
	public void show() {
		System.out.println("The type of class iis::"+obj.getClass().getName());
	}
	
	public T getObject() {
		return obj;
	}
}
public class genrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gen<String> g1 = new gen<String>("Nitin");
		g1.show();
		System.out.println(g1.getObject());
		
		gen<Integer> g2 = new gen<Integer>(10);
		g2.show();
		System.out.println(g2.getObject());
		
		gen<Double> g3 = new gen<Double>(10.25);
		g3.show();
		System.out.println(g3.getObject());
	}

}
