package ControlProg1;

public class SwitchCaseProg1 {

	public static void main(String[] args) {

		char oprator='+';
		double  p=100.2,q=150.4;
		switch(oprator)
		{
		case '+':
			System.out.println("Addition of given numbers are ="+(p+q));
			break;
		case '_':
			System.out.println("subtractions of given number are ="+(p-q));
			break;
		case '*':
			System.out.println("multiplication of given number are ="+(p*q));
			break;
			
		case '/':
			System.out.println("division of given number ="+(p/q));
			break;
			default:
				System.out.println("not applicable");
				
			
		}
	}

}
