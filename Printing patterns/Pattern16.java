import java.io.*;
import java.util.*;
class Pattern16                                                         
{
	public static void main(String args[])
	{
		System.out.println("Floyd's Triangle");
		  int n=5,i,j,k=1;
			for( i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(k +" ");
					k++;
				}
						
					System.out.println();  
			}
	}
}
