package javapractice;

public class lec13_inheritance2  extends lec12inheritancemain
{

	public static void main(String[] args) {
		// create object of child class means this class
		//dont need here main class object because we extend here parent class
		

		lec13_inheritance2 fb=new lec13_inheritance2();
		
		// this are 
		System.out.println(fb.flower);
		System.out.println(fb.number);
		
		fb.fblogin();
		fb.fbsignin();
		fb.methodfinal();
		fb.methodprotected();
		
	}

}
