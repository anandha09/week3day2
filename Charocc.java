package week3day2assi;

public class Charocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		 Character let = 'e';
		int count =0;
		//char[] a=str.toCharArray();
		int c=str.length();
		System.out.println("The length of the given string is" + c);
		for(int i=0;i<c;i++) {
			if(str.charAt(i)==let) {
				count++;
				}
			}
		System.out.println("The letter 'e' is repeated " + count + "times");
		
		
	}

}
