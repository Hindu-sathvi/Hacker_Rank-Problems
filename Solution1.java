/*https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true */
/*Java String Reverse */
/*code: */
import java.util.*;

public class Solution1 {
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
String input= s.nextLine();
if(isPalindrome(input))
{
    System.out.println("Yes");
}
else
{
    System.out.println("No");
    
}
s.close();
}
public static boolean isPalindrome(String input)
{
    int left =0;
    int right =input.length()-1;
    while(left<right)
    {
       if(input.charAt(left)!=input.charAt(right))
       {
           return false;
       } 
       left++;
       right--;
    }
    return true;
}
}