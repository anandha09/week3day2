package week3day2assi;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "pots"; 
		  boolean f = true;  
		int a=text1.length();
		int b=text2.length();
		if(a==b) {
			System.out.println("The given two string length are same");
		}
		char[] c=text1.toCharArray();
		char[] d=text2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		  f=Arrays.equals(c, d);  
		  if(f) {
			  System.out.println("They are anagrams");
		  }
		  else {
			  System.out.println("They are not anagrams");
		  }











	}

}
