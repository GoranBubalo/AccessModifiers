package package1;
import package2.*;

public class A {

	//protected String protectedMessage = "This is protected";
	
	public static void main(String[] args) {
		// access modifiers lesson
		
		//public - visible,available to other packages
		//protected - is accessible to a different class in a different package 
		//			  as long as that class is a subclass of whatever class contains protective member
		//private - only visible to the class that it contains it self
		
		//created an instance of our C Class in Class A
		//C c = new C();
		
		//(public)
		//is not visible = > is in a different package
		//System.out.println(C.defaultMessage);
		
		//System.out.println(c.publicMessage);
		
		//Instantiating Asub Class
		//(protected)
		//Asub asub = new Asub();
		//System.out.println(asub.protectedMessage);
		
		//(private)
		B b = new B();
		System.out.println(b.privateMessage);

	}


}
