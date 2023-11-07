package javapractice_2;

public class lec02_obj_2 {
	
	public void myobj() {
		System.out.println("object create done");
	}
	private void signin() {
		System.out.println("amazon sign in successful");
	}
	void signup() {
		System.out.println("fb signup done");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lec02_obj_2 obj2=new lec02_obj_2 ();
		
		obj2.signin();
		obj2.myobj();
		obj2.signup();
		
	}

}
