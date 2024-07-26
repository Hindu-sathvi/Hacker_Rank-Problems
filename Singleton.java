/*https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true */
/*java-singleton */
/*code */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton{
    // Public String instance variable
    public String str;

    // Private static instance of Singleton
    private static Singleton singleInstance;

    // Private constructor to prevent instantiation
    private Singleton() {
    }

    // Static method to get the single instance of Singleton
    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}
