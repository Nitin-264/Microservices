package Serializaltoon.com;
import java.io.*;

class Account implements Serializable {
    String username = "Sachin";
    transient String password = "tendulkar";

    private void writeObject(ObjectOutputStream oos) throws Exception {
        oos.defaultWriteObject();
        String enpwd = "123" + password;
        oos.writeObject(enpwd);
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        ois.defaultReadObject();
        String enpwd = (String) ois.readObject();
        password = enpwd.substring(3);
    }
}

public class cumtomisiedSeialisation {
    public static void main(String[] args) throws Exception {
        Account acc = new Account();
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("acc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(acc);
        System.out.println("Serialization Completed");

        System.out.println("De-serialization Started");
        FileInputStream fis = new FileInputStream("acc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Account acc1 = (Account) ois.readObject();
        System.out.println(acc1.username);
        System.out.println(acc1.password);
    }
}
