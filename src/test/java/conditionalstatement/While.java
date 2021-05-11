package conditionalstatement;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       test();
       testing();
	}

	
	
	
	public static void test()
	{
		
		int i=1;
		while(i<=10)
		{
			
			System.out.println(i);
			i++;}
	System.out.println("out of loop");
	
	}
	
	
public static void testing()
{
	int i=10;
	
	do
	{
		System.out.println(i);
		i++;
		
	}
	while(i<=30);
	System.out.println("test completes");
}
	
}
