import java.io.*;
import java.util.*;
class Pattern6
{
	public static void main(String args[])
	{
		System.out.println("decreasing   triangle with numbers");
		
		  int n=9,i,j;
			for( i=1;i<=2*n-1;i++)
			{
				if(i<=5)
				{
					for(j=1;j<=i;j++)
			        {
                        System.out.print("* ");				  
			        }
				}
				else
				{
					for( j=i;j<=9;j++)
					{
						System.out.print("* ");
					}
				}
						System.out.println();
			}
	
	}			
}
