package forloop;

public class Nestedloop {

	public void test() {
		for (int i = 0; i <= 3; i++)

		{
			for (int j = 0; j <= 3; j++)

			{

				System.out.println(i + "" + j);
			}
		}
		System.out.println("out of the block");
	}

	public static void star() {
		for (int i = 1; i <= 5; i++) { // jitni i ki value hogio utne star print hoge
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // for next line
		}

	}

	public static void reversestar() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversestar();
		star();
		star1();
		star2();
	}

	public static void star1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void star2() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}