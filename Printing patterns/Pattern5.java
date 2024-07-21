import java.io.*;
import java.util.*;
class Pattern5
{
	public static void main(String args[])
	{
		System.out.println("decreasing triangle with numbers");
		
		  int n=5;
			for(int i=1;i<=n;i++)
			{
			  for(int j=1;j<=n-i+1;j++)
			  {
                  System.out.print(j);				  
			  }
            System.out.println();
			}
	
	}			
}
