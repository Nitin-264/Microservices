//By default searching happens in rt.jar
import java.util.*;
import java.io.*;
public class PropertiesExample
{
public static void main(String[] args)throws Exception
{
//Creating a Properties Object
Properties p = new Properties();
//Establishing Stream b/w java and .properties file
FileInputStream fis = new FileInputStream("D:\\Lovedeepapp\\src\\collection\\com\\abc.properties");
//bind the data of .properties file to Properties Object
p.load(fis);

//Get the data from Properties Object
String jdbcUrl = p.getProperty("jdbcURL");
String user = p.getProperty("User");
String password = p.getProperty("Password");
//use this data as required by the application
System.out.println(jdbcUrl);
System.out.println(user);
System.out.println(password);
}
}