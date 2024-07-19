/*https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true */
/*End-of-file */
/*code */
import java.util.*;
public class Solution{

    public static void main(String[] args) {
        try (  Scanner sc = new Scanner(System.in)) {
            int lineNumber = 1;
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(lineNumber + " " + line);
                lineNumber++;
             }
        }
        
    }
}