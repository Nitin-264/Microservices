public class excpetion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("statement1");
		System.out.println(10/0);
		System.out.println("statement2");
        System.out.println("statement1");
try{
System.out.println(10/0);
}catch(ArithemticException e){
System.out.println(10/2);
}
System.out.println("statement2");
	}

}
