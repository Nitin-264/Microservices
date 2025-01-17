package com.studyopedia;
import java.util.function.*;
import java.util.*;
class StudentRecordNotFoundException extends RuntimeException
{
StudentRecordNotFoundException(String msg)
{
super(msg);
}
}
public class Optional2{
public static void main(String[] args){
String nullValue = null;
String result = Optional.ofNullable(nullValue).orElseGet(()->"notfound");

System.out.println(result);
System.out.println();
System.out.println(Optional

.ofNullable(nullValue)
.orElseThrow(
()-> new
StudentRecordNotFoundException("Record not found"))

);

}
}