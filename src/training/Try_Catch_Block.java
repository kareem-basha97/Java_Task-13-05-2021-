package training;

public class Try_Catch_Block 
{
	 public static void main(String[] args)
	 {  
	        try  
	        {  
	        int data=82/0;   
	        }  
	              
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("remaining code");  
	    }  
}
