package POMDemoProject.DemoProoj;

public class PalindromeString {

	public static void main(String[] args) {
		stringPalindrome("racecar");

	}

	
	public static void stringPalindrome(String str) {
		
		int len=str.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
			rev=rev + str.charAt(i);
			}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println(str + " is palindrome"); // Using string builder also we can reverse the string using the reverse()
		}
	}
}
