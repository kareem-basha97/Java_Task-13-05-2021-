package training;

public class Throw_KeyWord 
{
	static void test(int meeting)
	{  
	     if(meeting>10)  
	    	 
	      throw new ArithmeticException("not allowed"); 
	     
	     else  
	    	 
	      System.out.println("welcome to meeting");  
	   }  
	   public static void main(String args[])
	   {  
	      test(13); 
	      
	      System.out.println("remaining code");  
	  }  

}
