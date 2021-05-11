package scannerexampled;

import java.util.Scanner;

public class First {

	
	
	public static void main(String[] args)
	{
		First dgdg = new First();
		//obj.test();
		dgdg.testing();
	}


public  void test()
{
	
	Scanner obj = new Scanner(System.in);
	System.out.println("enter your name" );
	System.out.println("my name is  "  + obj.next());
	
	
}




public void testing()
{
	Scanner input = new Scanner(System.in);
	System.out.println("enter age"  );
	System.out.println("enter name"  );
	System.out.println("enter salary");
	
	System.out.println("age of person " +input.nextInt());
	System.out.println("name of person "  +input.nextLine());
	System.out.println("total salary"   +input.nextInt());
	
	
}



}

