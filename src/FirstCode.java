//A class is blueprint of an object;
//A type is define as a class that reference to another type
class Calci{
	//know something about an object is a variable
	int num1;
	int num2;
	int result;
	double result1;
	//does something is a method
	public int Add() {
	result=num1+num2;
	return result;
	}
	public int Sub() {
		result=num1-num2;
		return result;
	}
	public int Mul() {
		result=num1*num2;
		return result;
	}
	public double Div() {
		 result1=(double)num1/num2;
		 return result1;
	}
	public int modulas() {
		result=num1%num2;
		return result;
	}
}
public class FirstCode {

	public static void main(String args[]) {
		Calci cal;//here cal is a reference
		cal=new Calci();//here Calci is an object made by new keyword which create space in heap memory for cal
		 cal.num2=6;
		cal.num1=5;
		System.out.println(cal.Add());
		System.out.println(cal.Sub());
		System.out.println(cal.Mul());
		System.out.println(cal.Div());
		System.out.println(cal.modulas());
		
	}
}
