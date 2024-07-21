import java.io.*;
import java.util.*;
class Pattern17                                                        
{
	public static void main(String args[])
	{
		System.out.println("Hallow Rectangle");
		  int n=5,i,j;
			for( i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(i==1||j==1||i==n||j==n)
                    {
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
			
					
				}
				
						
					System.out.println(  );  
			}
					
	}
	
			
}
