package ControlProg1;

public class SwitchCase3 {

	public static void main(String[] args) {
		
		char opration = '/';
		int num1 = 23, num2 = 44;
		long mob = 8459002834l;
		switch (opration)
		{
		case '+':
			System.out.println("Addition ="+(num1+num2));
			break;
			
		case '-':
			System.out.println("subtraction ="+(num1-num2));
			break;
		case '*':
			System.out.println("multiplication ="+(num1*num2));
			break;
		case '/':
			System.out.println("divided ="+(num1/num2));
			break;
			default:
				System.out.println("invalied oprator");
				
		}
	}

}
