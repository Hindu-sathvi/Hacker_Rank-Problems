import java.io.*;
import java.util.*;
class Pattern13
{
public static void main(String args[])
{
int n=4;
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
for(int k=1;k<=n;k++)
{
	for(int l=1;l<=n-k+1;l++)
	{
		System.out.print("*");
	}
	System.out.println();
}
}
}