class Over{
	public void display() 
	{
		System.out.println("This is first class method");
	}
	public void display1() 
	{
		System.out.println("This is first class method1");
	}
}

class Over1 extends Over
 {
	
	@Override
	public void display() 
	{
		
		System.out.println("This is Second class method");
	}
	public void display1() 
	{
		super.display1();//call super class method then itself
		System.out.println("This is Second class method1");
	}
	public void config() 
	{
		System.out.print("Hello I am Config");
	}
}
public class MethodOverridingInhertance {
  public static void main(String[] args)
  {
	  Over1 o=new Over1();
	  o.display();
	  o.display1();
	  Over o1=new Over1();
	  o1.display();//Run time polymorphism bcz at runtime deciding which method to run
	 // o1.config();//show error because config is not present in first class //compile time 
  }
}
