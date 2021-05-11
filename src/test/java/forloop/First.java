package forloop;

public class First {

	public static void table()
	{
		
		for(int i=1;i<=10;i++)
		{
			int table1=2*i;
			System.out.println(table1);
		}
	}
	
	public static void reversetable()
	{
		
		for(int i=10;i>=1;i--)
		{
			int table=2*i;
			System.out.println(table);
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
table();
reversetable();
	}

}
