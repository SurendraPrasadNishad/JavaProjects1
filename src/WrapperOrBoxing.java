
public class WrapperOrBoxing {

	public static void main(String[] args) {
	
		//wrapper or boxing
		int i=8;//primitive data
		Integer a=new Integer(i);//boxing wrapping
		System.out.println(a);
       int p=a; //unboxing unwrapping
       System.out.println(p);
     //integete vs int
       
       //autowrapping and autounwrapping
       Integer b=5;
       
       int c=b;
       
       //parseInt is static so Integer
       String str="456";
       int m=Integer.parseInt(str);
       System.out.println(m);
       
	}

}
