
//int float double all has Number as abstract method
class Summation
{
	public void sum(Number i)
	{
		Number s=i;
		System.out.print(s);
	}
}

public class AbstractSecond {
   
	public static void main(String[] args) {

		Summation s=new Summation();
		s.sum(5);
	}

}
