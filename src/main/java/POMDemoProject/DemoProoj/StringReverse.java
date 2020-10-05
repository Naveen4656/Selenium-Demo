package POMDemoProject.DemoProoj;

public class StringReverse {

	public static void main(String[] args) {
		stringReverse("Karthikeya");

	}
	
	
 public static void stringReverse(String str) {
	 
	 int len=str.length();
	 String rev="";
	 
	 for(int i=len-1; i>=0; i--) {
	rev=rev + str.charAt(i);//append rev to string becoz first value is null
	 
 }
	
	System.out.println(rev);
}
}