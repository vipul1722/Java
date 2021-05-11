package array;

public class First {

	// collection of variables having same data type

	public static void test() {
		int array[] = { 11, 12, 12, 32, 13 }; // declare and initialize
		System.out.println("length of the array is " +array.length); // for length
		
		for (int i : array) {
			System.out.println(i); // for each loop to print all variables
		}

		for (int i = 0; i < array.length; i++) // for loop
		{
			System.out.println(array[i]);
		}
	}

	public static void testing() {
		int arr[] = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		System.out.println(arr[3]); // it will print default value
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testing();
		test();
	}

}
