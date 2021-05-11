package conditionalstatement;

public class Ifelse {
	
	public static void main(String[] args)
	{
		Ifelse obj = new Ifelse();
		obj.passfail();
		obj.numberlies();
	}

	int a =60;
	
	public void passfail()
	{
		
		if(a<=40)
		{
			
			System.out.println("fail");
		}
		
		else if(a>40)
		{
			
			System.out.println("pass");
		
		}
		
		else if(a==40)
		{
			
			System.out.println("pass on point");
		}
		
		
	}
	
	
	
	
	public void numberlies()
	{
		int a =80;
		
		if(a<=50 && a>=40)
		{
			System.out.println("avaerage");
		}
		
		else if(a<=100 && a>=90)
		{
			System.out.println("merit");
			
		}
		
		else if(a<=70 && a>=60)
		{
			
			System.out.println("first division");
		}
	
		else
		{
			
			System.out.println("fail");
		}
	}
}
