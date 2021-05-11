package javaprograms;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="testing";
		char[] inp=str.toCharArray();
	
		for(int i =inp.length-1;i>=0;i--)
		{
			System.out.print(inp[i]);
		}
		
		
		
	}
}
