import java.io.*;
import java.util.*;
class Pattern11
{
	System.out.println("Inverted pyramid");
	public static void main(String args[])
	{
		  int n=5,i,j;
			for( i=1;i<=n;i++)
			{

					for(j=1;j<=n;j++)
			        {
                      if(j<i)
					  {
			            System.out.print(" ");
					  }
					  else
					  {
						  System.out.print("* ");
					  }
					}
					System.out.println();
			}
	
	}			
}
