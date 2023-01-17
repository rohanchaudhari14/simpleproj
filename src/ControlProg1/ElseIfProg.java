package ControlProg1;

public class ElseIfProg {

	public static void main(String[] args) {
		 int marks = 100;
		 if(marks >=40 && marks<60)
		 {
			 System.out.println("student is pass is second class");
		 }
		 else if(marks >=60 && marks<75)
		 {
			 System.out.println("student is pass in first class");
			 
		 }
		 else if(marks >=75 && marks>89)
		 {
			 System.out.println("student is pass in distiction");
			 
		 }
		 else if(marks >=90 && marks<100)
		 {
			 System.out.println("student is paas in merite");
			 
		 }
		 else
		 {
			 System.out.println("student is fail");
			 
		 }
	}

}
