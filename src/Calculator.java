
 class Operation{
	int num1;
	int num2;
	int num3;
	//constructor overloading
	public Operation() {
		num1=5;
		num2=6;
		System.out.println(num1+ "  "+num2);
	}
	public Operation(int n1, int n2) {//n1 and n2 are local variable(brown) and num1 and num2 are object variable(blue)
		num1=n1;
		num2=n2;
		System.out.println(num1+ "  "+num2);
	}
	public Operation(int num1, int num2,int num3) {
		//num1,num2,num3 as local variable we are assing value to same local variable so to make this.num1 object=num1 local current
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		System.out.println(num1+ "  "+num2+" "+num3);
	}
	//method overloading 
	public void sum(double a, double b) {
		System.out.println(a+b);
	}
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
}
public class Calculator {
  public static void main(String args[]) {
	  Operation op;
	  op=new Operation(); //call to default constructor
	  op.num1=0;
	  op.num2=0;
	 op=new Operation(4,5);//call to parameterize constructor or overloaded 
	 op=new Operation(5,6,3);
	 //method called
	 op.sum(5, 6);
	 op.sum(9, 8);
	  
  }
}
