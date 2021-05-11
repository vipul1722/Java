package staticpackage;

public class FirstExample {

	
	static String collegename="dav";
	
	int rollnumber;
	String name;
	
	public void display()
	{
		System.out.println(collegename);   //we can also access static variable directly in non static method also 
	      classmethod();        //we can also call directly a static method in  non static method
	} 
	
	
	public static void classmethod()
	{
		System.out.println("this is a static method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(collegename);          //we can access directly static variables in static method
		
		FirstExample obj = new FirstExample();
		System.out.println(obj.name);  //print default value of name variable
		System.out.println(obj.rollnumber); //print default value of roll number
		System.out.println(collegename);      //no need to call static variable through object reference because static member belongs to the class rather than the object of the class
		classmethod();   //we can also call static method directly in static method
		obj.display();
	}

}
