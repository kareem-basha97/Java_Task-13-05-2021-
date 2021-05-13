package training;

public class Finally_Block
{
	 public static void main(String args[])
	 {  
		  try
		  {  
			  
		   int data=50/2;  
		   
		   System.out.println(data);  
		  }  
		  catch(NullPointerException e)
		  
		  {
			  System.out.println(e);
			  
		  }  
		  finally
		  {
			  System.out.println("finally block");
			  
		  } 
		  
		  System.out.println("remaining code");  
		  }  
}
