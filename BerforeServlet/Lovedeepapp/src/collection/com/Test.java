package collection.com;

public class Test {

	static Test t;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Test t1 = new Test();
		System.out.println(t1.hashCode());
		t1=null;
		System.gc();
		Thread.sleep(2000);
		
		System.out.println(t.hashCode());
		t=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println("End of main method");
		
	}
	@Override
	public void finalize() {
		System.out.println("finalize method called\\");
		t=this;
		
	}

}
