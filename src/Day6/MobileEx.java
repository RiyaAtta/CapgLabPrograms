package Day6;

import java.util.*;
public class MobileEx 
{
			static void validate(int n)throws InvalidPhone
			{  
			  
		     if(n!=10)  
		      throw new InvalidPhone(" Not valid");  
		     else  
		      System.out.println("Valid Phone num.");  
		   }  
		     
		   public static void main(String[] args)
		   { 
			   Scanner sc=new Scanner(System.in);
			   String s=sc.next();
			   int n=s.length();
			   try
			   {  
				   validate(n);  
			   	}
			   catch(Exception m)
			   {
		    	  System.out.println("Exception occured: "+m);
		    	}  
		  
		      System.out.println("rest of the code...");  
		  }  
		}