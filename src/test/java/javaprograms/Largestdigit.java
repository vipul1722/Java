package javaprograms;

public class Largestdigit {

	public static int test()

	{

		int array[] = { 10, 11, 23, 2, 3, 9, 14, 1, 3 };
		int temp;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i + 1; j < array.length; j++) 
			{
				if (array[i] > array[j]) 
				{

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(array[array.length - 1]); //largest
		System.out.println(array[array.length-2]);  //second
		System.out.println(array[0]); //smallest

		return array[array.length - 1];
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

}
