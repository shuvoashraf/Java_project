package javapractice;

public class lec03forloop {

	private static char[] d;

	public static void main(String[] args) {
		
		//for loop: should be 3 statement
		//for(st 1;st 2;st 3){
		          //block of code executed}
		// st1. execute 1 time before block of code execute,st2 how code executed,st3 howmany times code execute.
		
		// for loop print 0 to 9
		
		for (int i=0; i<=9; i++) {
			System.out.println(i);
		}
	
		//syntax
		
		// for(statement1;statement2;statement3){
		       //code block to be executrd}
		
		//print  17 to 23
		
		for (int a=17; a<=23; a=a+1) {
			System.out.println(a);
		}
		
		// print even values 0 to 25
		
		for(int x=2; x<=24; x=x+2) {
			System.out.println(x);
		
			
		}
		// print odd values between 10 to 20
		for (int y=11; y<=20; y=y+2) {
			System.out.println(y);
		}
		
		//print odd number 23 to 30
		
		for(int t=23;t<=30;t=t+2) {
			System.out.println(t);
		}
		
		//print even numbers 23 to 30
		
		for( int w=24;w<=30;w=w+2) {
			System.out.println(w);
			}
		
		
		//print even numbers  2 to 8
		for (int d=2;d<=8;d=d+2);
		System.out.println(d);

	
		
		}
		
	
	

	}

