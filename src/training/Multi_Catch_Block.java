package training;

public class Multi_Catch_Block 
{
	public static void main(String[] args)
	{  
        
        try
        {    
             int a[]=new int[5];    
             
             System.out.println(a[6]);  
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception");  
               }             
            System.out.println("remaining code");    

}
}
