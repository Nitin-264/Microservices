
class MyThread2 extends Thread{
	static Thread mt;
@Override
public void run(){
	try{
		mt.join();
		}
		catch (InterruptedException e){
		}
for (int i=1;i<=10 ;i++ ){
System.out.println("child Thread");

}
}
}
public class mutithreading6{
public static void main(String... args)throws InterruptedException{
	MyThread2.mt=Thread.currentThread();
MyThread2 t=new MyThread2();
t.start();

for (int i=1;i<=10;i++ ){
	Thread.sleep(1000);
System.out.println("Main thread");
}
}
}