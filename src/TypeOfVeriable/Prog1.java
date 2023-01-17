package TypeOfVeriable;

public class Prog1 {

	static int d = 100; //Global /instance variable
	public void add()
	{
		int a = 10, b = 20, c = 0;
		c = a + b;
		System.out.println("add = " + c);
		System.out.println("d in add method = " + d);
	}
	public void multiply ()
	{
		System.out.println("D = " +d);	
	}
	public static void main(String[] args) {
	
		Prog1 z = new Prog1();
		z.add();
		
	}

}
