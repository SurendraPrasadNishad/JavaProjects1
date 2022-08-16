//in the  sub constructor there is by default super() that call super class constructor .
//when you assign super(a) to the base class parameterized constructor it call the super class parameterize constructor
//to call parameretrized constructor from parameterless constructor use super(value ) in base class default constructor
class Calc{
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public Calc() 
	{
		System.out.println("This is a Default constructor of super class");
	}
	public Calc(int a) 
	{
		System.out.println("This is a parameterize constructor of super class");
	}
}
class CalcAdv extends Calc
{
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	
	public CalcAdv() 
	{super(5);
		System.out.println("This is a Default constructor of sub class");
	}
	public CalcAdv(int a) 
	{
		//super(a);
		System.out.println("This is a parameterize constructor of sub class");
	}
}

public class Inheritance {
  public static void main(String[] args)
  {
	  CalcAdv c=new CalcAdv();
	  c.sub(5, 6);
	  c.sum(8,9);
  }
}
