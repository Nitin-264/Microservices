package com.studyopedia;
@FunctionalInterface
interface Inter{
	void m1();
}
public class AnamonusInnerClass5 {

	int x=777;
	public void m2() {
		Inter i=()->{
			int y=888;
			System.out.println(y);
			System.out.println(this.x);
		};
		i.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new AnamonusInnerClass5().m2();
	}

}
