package Starpattern;

public class First {

	public static void main(String[] args) 
	{
		First obj = new First();
	//	obj.fisrtpattern();
	//	obj.secondpattern();
		obj.thirdpattern();
		
	}
	
	
	
	
	public void fisrtpattern()
	{
		
		for(int i=1;i<=5;i=i+1)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
	public void secondpattern()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}
	
	public void thirdpattern()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print(" ");
			}	
			for(int j=1;j<=i;j++)
			{
		    System.out.print("*");
			}
			System.out.println();	
				
			}
			
		}
		
		
	}
	

