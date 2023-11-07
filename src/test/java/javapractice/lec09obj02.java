package javapractice;

public class lec09obj02 {

	String flower1="Rose";
	String flower2="Sunflower";
	
	//create a method need few things
	//syntax  accessmodifier returntype methodname(){
	//block of code}
	
	public void method3() {
		System.out.println("abc");
	}
	
	public void method1() {
		System.out.println("NextTech ITC");
	}
	
	public static void main(String[] args) {
		// create an object
		
		lec09obj02 flower=new lec09obj02();
		System.out.println(flower.flower1);
		System.out.println(flower.flower2);
		

	}

}
