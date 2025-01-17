package com.annotation;

import java.lang.annotation.Documented;

@Documented
@interface Perseistable{
	
}

@Perseistable
      public class company {
      private int salary;
      private int age;

      company(int salary,int age){
	
       }
      public void getSalary() {
      }
}

