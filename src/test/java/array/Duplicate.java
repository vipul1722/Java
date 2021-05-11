package array;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[] {34,23,12,21,12,34,21,34};
		int count=0;
				
				
		
		for(int i=0;i<array.length;i++)
		{
		
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[i]);
					count++;
					break;
					
					
				}
				
			}
			}
		
		System.out.println("total no of duplicates are "   +count);
		
		
		
		
	}

}
