                                                                      package javapractice;

public class Lec02_ifElse {

	public static void main(String[] args) {
		
		
		// if we have only 1 cindition ,we use if statement
		// if statement 
		
		int a=99;
		int b=69;
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("NexttechBD");
		}
		
		
		//multiple condition else if statement
		//data 100 and 50.if 100 is greater than 50 print gd morning else print gd night
		int y=100;
		int z=50;
		if (y>z) {
			System.out.println("gd morning");
		}
		else {
			System.out.println("gd night");
		}
		
		
		int time =24;
		if (time<12) {
			System.out.println("Morning");
		}
		else if (time<14) {
			System.out.println("Afternoon");
			
		}
		else {			
			System.out.println("Evening");
		}
		
		// grading system
		int testscore =79;
		char grade;
		
		if (testscore >=90) {
			grade='A';
		}
		
		else if (testscore>=80) {
			grade='B';
		
		}else if (testscore>=70) {
			grade='C';
		}else if (testscore>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println("Grade" +grade);
		
		// data 25 and 10, if 25 is greater than 10 print good else print not good
		// note: after if statement no ;( use ; after code and print time)
		
		int i =25;
		int j =10;
		if (i>j)
		{System.out.println("good");

	    }
		else  {
		System.out.println("not good");
	}

}}


