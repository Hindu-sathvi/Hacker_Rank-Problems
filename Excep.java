/*https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true */
/*java-exception-handling-try-catch */
/*code */
import java.util.*;

public class Excep{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        try{
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x/y);
        }
        catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        }
    }
}