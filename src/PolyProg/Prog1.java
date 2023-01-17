package PolyProg;

//Compile	Time	polymorphism

public class Prog1 {
	public void add1()
	{
		int a = 1 , b = 2 , c;
		c = a+b;
		System.out.println("sum =" + c);
	}
	public void add (int a)
	{
		int c;
		c = a+a;
		System.out.println("sum = " + c);
		
	}
	public void add (int a, int b)
	{
		int c = a+b;
		
		System.out.println("sum = " + c);
	}
	public void add1(double a) 
	{
		double c;
		c = a+a;
		System.out.println("sum = " + c);		
	}

	public static void main(String[] args) {

     Prog1 z = new  Prog1();
      z.add1();
      z.add1('4');
      z.add('6', '7');
	 z.add1 (2.7);
	}
}
