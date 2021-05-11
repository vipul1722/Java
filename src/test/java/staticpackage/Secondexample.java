package staticpackage;

public class Secondexample {

	
	//static method and variable can be accessed dierectly without creating
	//object in static and non static methods
	
	static int a=10;
	static String name="vipul";
	
	public void display()
	{                                                         //calling static variable in non static methods
		System.out.println(a+""+name);    
	}
	
	
	public void test()
	{
		display();                //we can aslo call a non static method in another non static method
	}
	
	
	
	public static void testing()
	{
		System.out.println(a+""+name);                   //calling satic in static method
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
testing();
	}

}
