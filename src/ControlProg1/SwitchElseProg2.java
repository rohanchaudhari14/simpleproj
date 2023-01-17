package ControlProg1;

public class SwitchElseProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "sunday";
		switch(day)
		{
		case "monday":
			System.out.println("today is monday ");
			break;
		case "tusday":
			System.out.println("today is tusday ");
			break;
		case "thusrday":
			System.out.println("today is thusday ");
			break;
		case "wednsday":
			System.out.println("today is wednsday");
		case "friday":
			System.out.println("today is friday ");
			break;
		case "saturday":
			System.out.println("today is saturday ");
			break;
			default:
				System.out.println("its weekend");
		}
		System.out.println("switch is finish");
		
		
	}

}
