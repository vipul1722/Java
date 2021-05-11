package creatingobject;

public class Throughreference {

	int number;
	String name; // instance variable belongs to the object that why we are calling these
					// variables throgh object reference

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Throughreference obj = new Throughreference();
		obj.number = 90;
		obj.name = "vipul";
		System.out.println("Name of the stuent is " + obj.name);
		System.out.println(obj.number);

		Throughreference obj1 = new Throughreference();
		obj1.number = 45; // store info in object throgh reference variable
		obj1.name = "vipul";
		System.out.println(obj.name);
		System.out.println(obj.number);
	}

}
