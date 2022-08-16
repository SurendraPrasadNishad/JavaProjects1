//abstract class is made to be used in future it is not a concrete class it is not necessary all methods are abstract
abstract class Employee1//abstract class
{
 public abstract void future();
 public void display() 
 {
	 System.out.println("This is not abstract method");
 }
}
class Employee2 extends Employee1//concrete class
{
 public void future() 
 {
	 System.out.print("This is from abstract class method");
 }
 
}

public class AbstractCls {
  public static void main(String[] args) 
  {
	  Employee1 emp=new Employee2();
	  emp.display();
	  emp.future();
  }
}
