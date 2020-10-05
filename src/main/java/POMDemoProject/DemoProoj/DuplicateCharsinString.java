package POMDemoProject.DemoProoj;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsinString {
	
	
	public static void main(String[] args) {    
	       
		//String str1="India";
				countDuplicates("India is very great and i Very GoOD");
	}
	
	
	
	public static void countDuplicates(String str) {
		
		//Creating a HashMap containing char as key and it's occurrences as value
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		//Converting given string to char array
		String str1= str.toLowerCase().replaceAll("\\s", "");
		
		char[] charArray=str1.toCharArray();
		
		for(Character ch:charArray) {
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			} 
			else {
				map.put(ch,1);
		//System.out.println(map)	
			}
		}
		
		Set<Character> keys=map.keySet();
		
		System.out.println("Duplicates in String");
		
		for(Character ch:keys) {
			if(map.get(ch)>1) {
				System.out.println( ch  + " : " +  map.get(ch));
			}
			
		}
		
		
		}
		
	
		}
		
	
	
	
	
	


