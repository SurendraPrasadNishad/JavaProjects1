//Binding data through method 
class Student 
{
	private int roll;
	public void setRoll(int roll) 
	{
		this.roll=roll;
	}
	public int getRoll() 
	{
		return roll;
	}
	private String name; 
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
}
public class Encapsul {

	public static void main(String[] args) {
		Student s=new Student();
		s.setRoll(25);
		s.setName("Ramesh");
System.out.println(s.getRoll());
System.out.println(s.getName());
	}

}
