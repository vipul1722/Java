package array;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	int array[]=new int[] {10,20,40,5,100,2};
	
	int max=array[0];
	int min=array[0];
	
	for(int i=1;i<array.length;i++)
	{
		if(array[i]>max)
		{
			max=array[i];
		}
		
		else if(array[i]<min)
		{
			min=array[i];
			
		}
	}
	
	System.out.println("max number is " +max);
	System.out.println("min number is"   +min);
	}
	}
	
	
