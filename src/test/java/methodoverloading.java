
public class methodoverloading {

	
	
	public int add(int a ,int b)                   //same name method having different number of parameter
	{
		return a+b;
	
	}
	
	
	
	public int add(int a,int b ,int c)
	{
		
		int d=a+b+c;
		return d;
	}
	
	public double add(double a,double b)
	{
		double c=a+b;   //same number of parameters but different data type of arguments

		System.out.println(c);
		return c;                         //return is last statement.cannot add any statement after that
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodoverloading obj = new methodoverloading();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10, 20, 30));
		obj.add(2.0, 2.0);
	}

}
