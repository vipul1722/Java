package ifelsepackage;

public class First {

	int age = 20;

	public void validage() // check age is valid for vote
	{
		if (age > 20) {
			System.out.println("person can vote");
		}

		else if (age <= 10) {
			System.out.println("person is minor");
		}

		else if (age >= 15 && age <= 19) // to specify multiple statements
		{
			System.out.println("wait for some time for vote");
		}

		else {
			System.out.println("not lies in any block");
		}
	}

	public static void country() {                           //check which country is friendly according to the country name

		String countryname = "Paris ";

		if (countryname == "India") {
			System.out.println("india isfriendly");
		}

		else if (countryname == "Pakistan") {
			System.out.println("Pakistna is not friendly");
		}

		else if (countryname == "America" && countryname == "Russia") {
			System.out.println("America and russia is friendly");                      //if one condition is false it doesn't check the other condition
		}                                                                              //both condition needs to be true

		else if (countryname == "Paris" || countryname == "France") {
			System.out.println("Paris and France is friendly");                      //one condition need to be true
		}                                                             
		else
		{
			System.out.println("all other countries are far away from race");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First obj = new First();
		obj.validage();
		country();
	}

}
