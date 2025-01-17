package com.studyopedia;
class Doctor
{
private String sname;
private boolean married;
public void setSname(String sname)
{
this.sname = sname;
}
public void setMarried(boolean married)
{
this.married =married;
}

public String getSname()
{
return sname;
}
public boolean isMarried()
{
return married;
}
}
class oopsPillar{
public static void main(String[] args) {
Doctor d= new Doctor();
d.setSname("karthik");
d.setMarried(true);
boolean status = d.isMarried();
String name = d.getSname();
System.out.println("Name is : " +name);
System.out.println("Status is : " +status);

}
}