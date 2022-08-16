
 class Multi1{
	 public void show() 
	 {
		 System.out.println("This first class");
	 }
 }
 
 class Multi2{
	 public void show() 
	 {
		 System.out.println("This first class");
	 }
 }
 
 class Result extends Multi1  //Multi2
 {
	
	 //uncomment all and run
 }
	
public class JavaNotMultInheritance 
{
	public static void main(String[] args) 
	{
		Result r=new Result();
		r.show();
	}

}
