package ifelsepackage;

public class Nestedifelse {

	public static void votecheck() {
		int age = 18;
		String country = "India";
		if (age >= 18) {
			if (country == "India") {
				System.out.println("user can vote");
			}
                                                                      //program to check user can vote otr not
			else {
				System.out.println("user cannot vote");
			}
		}

		else {
			System.out.println("use cannot vote");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program to check you are elogible to donate blood or not

		votecheck();

		int age = 18;
		int weight = 70;

		if (age >= 18) // condition 1
		{
			if (weight >= 60) // condition 2
			{
				System.out.println("person can donate"); // this block will execute if the condition1 and 2 is truw
			}

			else {
				System.out.println("you are not elogible"); // when condition 1 is true and 2 is false
			}
		} else {
			System.out.println("your age is less to donate blood"); // when conditon 1 is false
		}

	}

}
