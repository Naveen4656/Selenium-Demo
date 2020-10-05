package POMDemoProject.DemoProoj;



//program to count the nummber of characters in a given string
public class CountCharacter    
{    
   
	
public	static void charCount(String str) {
		
		int count = 0;    
        
        //Counts each character except space    
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
        System.out.println("Total number of characters in a string: " + count); 
	}
	public static void main(String[] args) {    
       
    	//String string = "Selenium Automation Naveen Kumar Murala";    
        charCount("Naveen Kumar");
            
        //Displays the total number of characters present in the given string    
        //   
    }    
}     