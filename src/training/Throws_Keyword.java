package training;

import java.io.IOException;

public class Throws_Keyword 
{
	void method()throws IOException
	{  
		  throw new IOException("device error");  
		 
	}  
		}  
		 class Test
		{  
		   public static void main(String args[])
		   {  
		    try
		    {  
		    	
		    Throws_Keyword  m=new Throws_Keyword();  
		    
		    m.method();  
		    }
		    
		    catch(Exception e)
		    {
		    	System.out.println("exception handled");
		    	}     
		  
		    System.out.println("remaining code");  
		  }  

}
