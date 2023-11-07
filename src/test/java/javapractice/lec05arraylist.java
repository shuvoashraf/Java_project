package javapractice;

import java.util.ArrayList;

public class lec05arraylist {

	public static void main(String[] args) {
		//arraylist is resizable
		
		// syntax: arraylist<datatype> variablename= new arraylist<datatype>();
		
		//code of arraylist
		ArrayList<String> cars = new ArrayList<String>(); //Creat an ArrayList object
		
		//add the data
		
		cars.add("BMW");
		cars.add("Camry");
		cars.add("Toyota");
	
		System.out.println(cars);
		
		
		//access an item in arraylist
		System.out.println(cars.get(0));
		
		// change an item
		cars.set(0, "Bentley");
		System.out.println(cars.set(0,"bentley"));
		// size of arraylist
		System.out.println(cars.size());
		
		//remove an item
		cars.remove(1);
		System.out.println(cars.remove(1));
		
		


	}

}
