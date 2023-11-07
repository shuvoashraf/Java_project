
package javapractice;

import java.util.HashMap;

public class lec06hashmap {

	public static void main(String[] args) {
		// HashMap<String,String>CapitaCities=new HashMap<String,String>();
		
		//store 4 cities and Country name
		HashMap<String,String>Cities=new HashMap<String,String>();
		
		Cities.put("Jamaica","NY");
		Cities.put("Dhaka","BD");
		Cities.put("Tokyo","Japan");
		Cities.put("Toronto","Canada");
		System.out.println(Cities);
		
		//access an item 
		Cities.get("Jamaica");
		System.out.println(Cities.get("Jamaica"));
		System.out.println(Cities.get("Dhaka"));
	    System.out.println(Cities.get("Tokyo"));
	    System.out.println(Cities.get("Toronto"));
	    
	    //remove an item
	    Cities.remove("Jamaica");
	    System.out.println(Cities.remove("Jamaica"));
	    
	    //clear an item
	    Cities.clear();
	    
	    
	    // size 
	    Cities.size();
	    
	}
}
