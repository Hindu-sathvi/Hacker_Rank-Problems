import java.io.*;
import java.util.*;
class Pattern7
{
	public static void main(String args[])
	{
		
		  int n=9,i,j;
			for( i=1;i<=2*n-1;i++)
			{
				if(i<=5)
				{
					for(j=1;j<=i;j++)
			        {
                        System.out.print(j);				  
			        }
				}
				else
				{
					for( j=1;j<=n-i+1;j++)
					{
						System.out.print(j);
					}
				}
						System.out.println();
			}
	
	}			
}
