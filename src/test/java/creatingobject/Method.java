package creatingobject;

public class Method {

	int rollnumber;
	String name;

	public void insertrecord(int r, String s) {
		rollnumber = r;
		name = s;
	}

	public void displayrecord() {

		System.out.println(rollnumber + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method obj = new Method();
		obj.insertrecord(100, "Vipul");
		// System.out.println(obj.rollnumber); //another way
		obj.displayrecord();
		Method obj1 = new Method();
		obj1.insertrecord(11, "shflejdf"); // creating multiple object here
		obj1.displayrecord();

	}

}
