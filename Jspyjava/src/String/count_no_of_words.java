package String;

public class count_no_of_words {
	    public static void main(String[] args) {    
	      
	    	String s1="abcdefghijklmnopqrstuvwxyz";
	    	int count=0;
	    	
	    	
	    	for(int i=0;i<s1.length();i++) {
	    		if(s1.charAt(i)!=' ')
	    		count++;
	    	}
	    	
	    	System.out.println("total character present in string is =  "+count);
	    	
	    	
	    }    
	}     

