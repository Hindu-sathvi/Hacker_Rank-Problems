import java.io.*;
import java.util.*;
class Pattern21                                                        
{	public static void main(String args[])
	{
		System.out.println("Numberpyramid");
		  int n=5,i,j;
			for( i=1;i<=n;i++)
			{
				int spaces=n-i;
				for(spaces=1;spaces<=n-i;spaces++)
				{
					System.out.print(" ");
				}
				for(j=i;j>=1;j--)
				{   
						System.out.print(j);
					
					
				}
				for(j=2;j<=i;j++)
				{
					System.out.print(j);
				}
				
				
				
						
					System.out.println(  );  
			}
					
					
	}
	
			
}
