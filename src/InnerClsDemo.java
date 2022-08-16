class Outer
 {  
    public int sum(int num1, int num2) 
    {
    	return num1+num2;
    }
	public void outDisplay()
	{
		System.out.println("Hello this is outer class");
	}
	 class Inner
	{  public int sub(int num1, int num2) 
	   {
	
		return num1-num2;
	   }
		public void inDisplay() {
		System.out.println("Hello this is inner class");
	}
	}
		static class Inner2
		{  public int sub(int num1, int num2) 
		   {
		
			return num1-num2;
		   }
			public void in2Display() {
			System.out.println("Hello this is static inner2 class");
		}
	}
 }


public class InnerClsDemo {
 public static void main(String args[]) 
 {
	 //creating object for outer class
	 Outer out=new Outer();
	 out.outDisplay();
	 System.out.println(out.sum(4,5));
	 //creating object for inner class
	 Outer.Inner in=out.new Inner();
	 in.inDisplay();
	System.out.println( in.sub(18,12));
	//for inner 2 class
	Outer.Inner2 in2=new Outer.Inner2();
			in2.in2Display();
	 
 }
}
