package javapractice;

import javapractice_2.lec01method_01;

public class Lec07oop {
  
	int number=5;
    String school="NextTech ITC";
   
	
   public static void main(String[] args) {
		//oop;object oriented programing
	   //java is rich language,if i have code ,i don't need to write code again and again
	   //i can reuse code ,by creating an object of this class
	   //class:USA   object:NY
	   //claas is template for object,object is instance of class
	   //in class we have 1-attribute 2-Method
	   //
	   
	   
	   // create an object of class for access the code
		
		
	   Lec07oop OOP=new Lec07oop(); //syntax  classname objectname=new classname();
		
	    System.out.println(OOP.number);        
		System.out.println(OOP.school);
		
		
		lec01method_01 method_01 =new lec01method_01();
		
		System.out.println(method_01.i);
		System.out.println(method_01.abc);
		
		
	}

}

