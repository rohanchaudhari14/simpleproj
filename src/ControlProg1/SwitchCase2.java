package ControlProg1;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		char opration = '/'; 
		int num1 = 10 , num2 = 20;
		long mob = 8459002834l;
		
		switch ( opration )
		{
			case '+':
			System.out.println("Addition =" +(num1+num2));
			break;
			case '-':
				System.out.println("Subtraction =" +(num1-num2));
				break;
			case '/':
				System.out.println("Division =" + (num1/num2));
				break;
			case '*':
				System.out.println("Multiplication =" + (num1*num2));
				break;
				
				default:
					System.out.println("invoild oprater");
					
		}
	}

}
