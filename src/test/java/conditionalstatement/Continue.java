package conditionalstatement;

public class Continue {

	public static void main(String[]args)
	{
		test();
		testing();
	}
	public static void test()
	{
		for(int i=1;i<=10;i++)
		{
			
			if(i%2==0)
			{
				
				continue;
				
			}
			
			System.out.println("odd number are " +i);
		}
		
		
	}
	
	
	public static void testing()
	{
		
		for(int i=1;i<=10000;i++)
		{
			
			if(i==9)
			{
				break;
			}
			
			System.out.println(i);
		}
		
	}
	
}
