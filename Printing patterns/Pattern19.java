import java.io.*;
import java.util.*;
class Pattern19                                                        
{
	public static void main(String args[])
	{
		System.out.println("Butterflypattern");
		  int n=5,i,j;
			for( i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{   
						System.out.print("*");
					
					
				}
				int spaces=2*(n-i);
				for(j=1;j<=spaces;j++)
				{
					System.out.print(" ");
				}
				//one time see
				for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				
						
					System.out.println(  );  
			}
			for( i=n;i>=1;i--)
			{
				for(j=1;j<=i;j++)
				{   
						System.out.print("*");
					
					
				}
				int spaces=2*(n-i);
				for(j=1;j<=spaces;j++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println(  );  
			}
	}		
}
