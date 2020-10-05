package POMDemoProject.DemoProoj;

import java.util.HashMap;

public class HashMapInSelenium {
	
	
	public static void main(String [] args) {
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	
	map.put("naveen",1);
	map.put("kuamr",2);
	map.put("karthik",3);
	map.put("dhruva",4);
	map.put("naveen", 5);// duplicates keys are over rided in hashmap
	
	System.out.println(map.size());
	System.out.println(map);
	System.out.println(map.keySet());//keySet returns the values of hashmap in the form of set
	
	System.out.println(map.containsKey("xyz"));
	System.out.println(map.containsValue(2));//The java.util.HashMap.containsValue() method 
												//is used to check whether a particular value is being mapped by a single or more than one key 
												//in the HashMa
	
 
System.out.println(map.get("naveen"));//get() prints the value of the hashmap
System.out.println(map.get("kuamr"));
System.out.println(map.get("karthik"));
System.out.println(map.get("dhruva"));


System.out.println(map.remove("naveen"));//remove()removes a
System.out.println(map.keySet());
map.clear();//clear ()removes all the key values form the hash map

System.out.println(map);
System.out.println(map.isEmpty());//it checks whether the hash map is empty or not


}
}