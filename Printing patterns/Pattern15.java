import java.io.*;
import java.util.*;
class Pattern15                                                         
{
	public static void main(String args[])
	{
		System.out.println("Descending Repetitive Number Triangle");
		  int n=5,i,j;
			for( i=1;i<=n;i++)
			{
				for(j=1;j<=n-i+1;j++)
				{
					System.out.print(i);
				}
						
					System.out.println();  
			}
	}
	
}
