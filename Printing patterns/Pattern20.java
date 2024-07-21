import java.io.*;
import java.util.*;
class Pattern20                                                        
{
	public static void main(String args[])
	{
		System.out.prinln("Parllelogram");
		  int n=5,i,j;
			for( i=1;i<=n;i++)
			{
				int spaces=n-i;
				for(spaces=1;spaces<=n-i;spaces++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=n;j++)
				{   
						System.out.print("*");
					
					
				}
				System.out.println(  );  
			}
					
	}
		
}
