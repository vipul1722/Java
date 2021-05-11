package constructor;

public class Bothexamples {

	int number;
	String name;
	float hg;

	Bothexamples() {

		System.out.println("default constructor");
	}

	Bothexamples(int n, String h) {
		number = n;
		name = h; // paramerterized constructor

	}

	public void display() {
		System.out.println(number);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bothexamples obj = new Bothexamples(); // default constructor called
		Bothexamples obj1 = new Bothexamples(10, "vipul"); // parameterized constructor called and a object is created
															// using new keyword and construcore assign the values to
															// this object and ibj1 is just a reference variable
		obj1.display(); // displaying values for obj1
		// System.out.println(obj1.name); //checking that we can also called variables
		// after object creation throgh reference variabe.meand no need to call throgh
		// method
		// System.out.println(obj.hg); //printing default value for obj reference
		// varaible

	}

}
