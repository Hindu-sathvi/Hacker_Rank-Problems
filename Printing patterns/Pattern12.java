import java.io.*;
import java.util.*;
class Pattern12
{
	System.out.println("Pyramid");
	public static void main(String args[])
	{
		  int n=9,i,j;
			for( i=1;i<=(n/2)+1;i++)
			{

					for(j=1;j<=n;j++)
			        { 
				        if(j<=i||j<=n-i+1)
						{
							
							System.out.print(" ");
						}
						else
						{
							
						
							System.out.print(" *");
					    }
					  
					}
					System.out.println();
			}
	
	}			
}
