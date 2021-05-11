package javaprograms;
import java.util.Scanner;


public class Reversewordtoword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My name is vipul";
		String reverseword="";
		String reversestring="";
		
		String words[]=str.split("//s");
		
		for(int i =0;i<words.length;i++)
		{
			String word=words[i];
			
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword=reverseword+word.charAt(j)+"";
			}
			reversestring=reversestring+reverseword;
		}
		System.out.println(reversestring);
		

	}}


