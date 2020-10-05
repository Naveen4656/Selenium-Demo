package POMDemoProject.DemoProoj;

public class ReverseEachWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseEachWord("Java is wonderful programming language");
	}
	
	public static void reverseEachWord(String str) {
		
		String[] words=str.split("\\s");
		String rev="";
		
		for(String w : words) {
			String Builder sb=new String Builder(w);
			sb.reverse();
		}
		
	}
	
	
	

}
