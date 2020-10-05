package POMDemoProject.DemoProoj;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDuplicateWordsinString("Java is java the python and the python the java is evergreen evergreen");
		

	}

	
	public static void countDuplicateWordsinString(String inputstring) {
		
		//split the string based on spaces
		String[] words=inputstring.split(" ");
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		
		for(String strcount:words) {
			if (map.containsKey(strcount)) {
				map.put(strcount.toLowerCase(),map.get(strcount)+1);
				
			}else
				map.put(strcount,1);
		}
		
		Set<String> keys = map.keySet();
		
		System.out.println("Duplicate words in string are : ");
		
		for(String str:keys) {
			if(map.get(str)>1) {
				System.out.println(str + " : " + map.get(str));
				
			}
		}
		
		
		
		
	}
}
