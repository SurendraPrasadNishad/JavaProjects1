class Employee{
	//in a company one CEO and other are employees 
	int empId;
	double empSalary; 
	//if you do not want variable for object specific then make it static so that it would be same for all object, it is not in heap ,it is in class loader memory
	static String ceo; 
	//printing data
	public void show() {
		System.out.println(empId+"  "+empSalary+"  "+ceo);
	}
	//static block is block in java that is loaded only once so use for initializing static
	static {
		ceo ="Harry";
	}
	//constructor is used for initiliazing not static 
	public Employee() {//when from main class value is not assign to rahul or nayak then from constructor default value is assign
		empId=5;
		empSalary=15000;
		//ceo="Rama";//but it is loaded in class loader it is not lodded in heap so you have to use static block
	}
}

public class StaticDemoApp {
 public static void main(String args[]) {
	 Employee rahul=new Employee();//Object for employee rahul ,every object has their own data,once class is load then object created in class loader memory
	 rahul.empId=1;
	 rahul.empSalary=45000;
	 Employee.ceo="Ramesh";//to access static variable we dont need object
	
	 
	 Employee nayak=new Employee();//Object for nayak,every object has their own data
	 nayak.empId=2;
	 nayak.empSalary=35000;
	 Employee.ceo="Ramesh";
	 Employee.ceo="Gyanesh";//suppose the ceo change then it should also change for rahul object so for sharing static keyword is used that is loaded before object is created
	 rahul.show();
	 nayak.show();
	 //you can also make method static ,
 }
}	
	

