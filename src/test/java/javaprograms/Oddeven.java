package javaprograms;

public class Oddeven {

	
	public static void test()
	{
		int array[]= {10,23,21,22,2,4,5,7,9,11,10};
		System.out.println("odd number are");
		for(int i =0;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				System.out.println(array[i]);
			}
		}

		System.out.println("even numners are");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.println(array[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           test();  
           

	}

}
