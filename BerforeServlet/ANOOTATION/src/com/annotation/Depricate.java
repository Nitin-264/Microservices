package com.annotation;
class Employee{
	@Deprecated
	public void getSalary(int basic ,int at) {
		System.out.println("The salary of the employe is"+(basic+at));
	}
	public void getSalary(int basic ,int at,int ft,int bonus) {
		System.out.println("The salary of the employe is"+(basic+at+ft+bonus));
	}
}
public class Depricate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp =new Employee();
		
		emp.getSalary(500000,20000,10000,50000);
	}

}
