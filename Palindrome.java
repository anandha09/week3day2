package week3day2assi;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="anandh";
		String reve="";
		for(int i=a.length()-1;i>=0;i--) {
			
			reve=reve+a.charAt(i);
			//System.out.println(reve);
		}
		System.out.println(reve);
		if(a.equals(reve)) {
			System.out.println("The given String is palinrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}
		

	}

}
