package conditionalstatement;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Forloop obj = new Forloop();
obj.practise();
obj.practise2();
//obj.practise3();
obj.practise4();
//obj.star();
//obj.star2();
obj.star3();
	}

public void practise()
{
	int a=0;
	                                              //table
	for(int i=1;i<=10;i=i+1)
	{
		a=i*2;
		System.out.println(a);
		
	}
}


public void practise1()
{
	                                       //counting
	for (int i=100;i>=1;i--)
	{
		
		System.out.println(i);
	}
	
}



public void practise2()
{
	
	for(int i=1;i<=100;i++)
	{
		if(i%2==0)                                              //odd even
		{
			System.out.println("even");
		}
		
		else
		{
			System.out.println("odd");
		}
	}
}

public void practise3()
{
	for(int i=1;i>=1;i++)
	{
		                                                 //infinite loop
		System.out.println(i);
	}
	
	
}

public void practise4()

{
	
	
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=2;j++)
		{                                         
			System.out.println(i+"  "+j );
			
		}
		System.out.println("out of block");
	}
}



public void star()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");          // inner block is responsible for printing the stars
		}
		
		System.out.println();
	}
	
	
	
}

public void star2()
{
	for(int i=5;i>=1;i--)
	{
		
		for(int j=1;j<=i;j++)                      //neso academy
		{
			System.out.print("*");
	
		}
	
	System.out.println();
	}
	
	
}


public void star3()
{
	
	for(int i=1;i<=5;i++)
	{
		for(int s=1;s<5-i;s++)
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
