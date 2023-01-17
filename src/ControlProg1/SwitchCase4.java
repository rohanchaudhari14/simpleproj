package ControlProg1;

public class SwitchCase4 {

	public static void main(String[] args) {
		
		char opration = '+';
		int  num1 = 34, num2 = 76;
		switch (opration)
		{
		case '+':
			System.out.println("addition ="+(num1+num2));
			break;
		case '-':
			System.out.println("subtraction ="+(num1-num2));
			break;
		case'*':
			System.out.println("multiplication ="+(num1-num2));
			break;
		case'/':
			System.out.println("divide ="+(num1/num2));
			break;
			default:
				System.out.println("invalid oprate");
				
		}
		
	}

}
