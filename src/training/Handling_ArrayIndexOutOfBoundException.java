package training;

public class Handling_ArrayIndexOutOfBoundException 
{
	public static void main(String[] args) 
	{  
        try  
        {  
        int arr[]= {2,8,7,6};  
        System.out.println(arr[10]);    
        }  
            
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}
