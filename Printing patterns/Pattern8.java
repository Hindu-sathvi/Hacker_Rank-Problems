import java.io.*;
import java.util.*;
class Pattern8
{
	public static void main(String args[])
	{
		  int n=5,i,j=1;
			for( i=1;i<=n;i++)
			{

					for(j=1;j<=n;j++)
			        {
                      if(j<n-i+1)
					  {
			            System.out.print(" ");
					  }
					  else
					  {
						  System.out.print("*");
					  }
					}
					System.out.println();
			}
	
	}			
}
