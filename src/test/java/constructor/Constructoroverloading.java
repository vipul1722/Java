package constructor;

public class Constructoroverloading {

	int id;
	String name;
	int number;

	Constructoroverloading() {
		System.out.println("default constructor");
	}

	Constructoroverloading(int i, String s) {

		id = i;
		name = s;

	}

	Constructoroverloading(int i, String s, int n) {
		id = i;
		name = s;
		number = n;
	}

	public void display() {

		System.out.println(id + " " + name + " " + number);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructoroverloading obj = new Constructoroverloading(); // print default constructor in output
		obj.display();
		Constructoroverloading obj1 = new Constructoroverloading(2, "yfuyfu");
		obj1.display();
		Constructoroverloading obj2 = new Constructoroverloading(2, "vipul", 98);
		obj2.display();

	}

}
