package org.sanju.onlineApp.Lambda;
import static java.lang.Math.pow;
import java.io.*;
import java.util.*;
public class po {
	
	    public static void main(String args[] ) throws Exception {
	            Scanner sc=new Scanner (System.in);
	         int n;
	         int p;
	            for(int i=0;i<4;i++)
	            {
	            	n=sc.nextInt();
	            	p=sc.nextInt();
	            	power(n,p);
	            }
	           
	             //int j= 
	            
	             //System.out.println(j);
	   }

	   public  static void  power(int n, int p)  {  

	      try{
	    	  if(n>0 && p>0) {
	    		  int re=(int) Math.pow(n, p);
	    		  System.out.println(re);
	    	  }
	    	  
	      else if(n<0 ||p<0)
	         throw new Negativeexception();
	       
	          else if(n==0 || p==0)
	          throw new Zeroexception();
	      }

	      catch(Negativeexception e){
	          e.getMessage();
	      }
	      catch(Zeroexception e1){
	          e1.getMessage();
	      }
		//  return (int) Math.pow(n,p);
	      
	 }
	}

	class Negativeexception extends Exception{
	  Negativeexception(){
	      System.out.println("java.lang.Exception:n or p should not be negative");
	  }
	} 

	class Zeroexception extends Exception{
	    Zeroexception(){
	        System.out.println("java.lang.Exception:n and p should not be zero");
	    }
	}

