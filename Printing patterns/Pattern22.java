import java.io.*;
import java.util.*;
class Pattern22                                                        
{	public static void main(String args[])
	{
		System.out.println("Daimond Pattern");
		  int n=5,i,j;
		  //upper half
			for( i=1;i<=n;i++)
			{
				int spaces=n-i;
				for(spaces=1;spaces<=n-i;spaces++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=(2*i)-1;j++)
				{   
						System.out.print("*");
					
					
				}
					System.out.println(  );  
			}
			//lower half
			for( i=n;i>=1;i--)
			{
				int spaces=n-i;
				for(spaces=1;spaces<=n-i;spaces++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=(2*i)-1;j++)
				{   
						System.out.print("*");
					
					
				}
					System.out.println(  );  
			}
					
					
	}
	
			
}
