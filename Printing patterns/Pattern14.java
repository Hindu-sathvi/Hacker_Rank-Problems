import java.io.*;
import java.util.*;
class Pattern14
{
	public static void main(String args[])
	{
		  int n=5,i,j;
			for( i=1;i<=n;i++)
			{
				for(int space=0;space<n-i;space++)
				{
					System.out.print(" ");
				}
				//first half
					for(j=i;j>=1;j--)
			        { 
				      
							
							System.out.print(j  );
					}
				//second half
					for(j=2;j<=i;j++)
					{
						
						
						System.out.print( j  );
					}
						
					System.out.println();  
			}
					
	}
	
			
}
