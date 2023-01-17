package ControlProg1;

public class SwitchCaseprog2 {

	public static void main(String[] args) {
		
		char operator = '+';
		double A=122.23, B= 333.23;
		switch(operator)
		{
		case  '+':
			System.out.println("addition of given number are ="+(A+B));
			break;
		case '-':
			System.out.println("subtraction of given numbers are ="+(A-B));
			 break;
		case '*':
			System.out.println("multiplication of given numbers are="+(A*B));
			break;
		case '/':
			System.out.println("division of given numbers are ="+(A/B));
			break;
			default:
          System.out.println("not applicable");
          
		}
		
		
	}

}
