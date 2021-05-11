package creatingobject;

public class Throughconstructor {

	int number;
	String name;

	Throughconstructor(int n, String s) {
		number = n;
		name = s;

	}

	public void display() {
		System.out.println(number + " " + name); // we can call directly these instance variables in non static
													// methods,for static we need object reference
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Throughconstructor obj = new Throughconstructor(10, "vipul");
		obj.display();
	}

}
