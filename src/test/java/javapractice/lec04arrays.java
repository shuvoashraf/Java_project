package javapractice;

public class lec04arrays {

	public static void main(String[] args) {
		
		// 1.array where we can store multiple data in one variable
		 //  2.array is fixed
		// use [] square bracket between datatype and variable name
		// index start 0,1,2,...
		// number start 1,2,3....
		// data store index wise
		// for access data use index number like 10,1,2...
		
		
		String [] Fruits = {"Mango","Apple","Orange"};
		System.out.println(Fruits[0]);
		
		
		char [] grade= {'a','b','c'};
		System.out.println(grade[2]);
		   
		// store 4 cars by using array
		String[] cars= {"bmw","honda","toyota","lexus"}; 
		//how data access in array
		
		System.out.println(cars[1]);
		
		//store multiple data in array
		
		String [] laptops= {"hp","lenovo","dell","apple","samsung"};
		System.out.println(laptops[2]);
		
		// find the length of array
	
		System.out.println(laptops.length);
		
		//exchange array
		//variablename []= "data"; 
		laptops [1]="sony";
		System.out.println(laptops[1]);
		
		
		
		
		}

}
