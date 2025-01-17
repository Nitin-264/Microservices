package com.studyopedia;
import java.util.function.Supplier;
public class Supplier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Supplier<String> s = () -> {
            
            String Pass ="";
            String Symbol="QERTYUIOPASDFGHJKLZXCVBNM@$#";
            Supplier<Integer> i1=()->(int)(Math.random()*10);
            Supplier<Character> c1=()->Symbol.charAt((int)(Math.random()*28));;
            
            
            for(int i=1;i<9;i++) {
            	if(i%2==0) {
            		//Even places
            		Pass+=i1.get();
            	}
            	else {
            		//OOdd places
            		Pass+=c1.get();
            	}
            }
         
            return Pass;
            
        };

        System.out.println(s.get());
        System.out.println(s.get());
	}

}
