import java.util.*;
import java.io.*;
public class lastdigit {
    public static void main(String[] args) {
        
    
    int n=987;
    double a=0;
    
        a=n%10;
       
    String s = String.valueOf(n);
    int len=s.length();
    char[] c = s.toCharArray();
    System.out.println(a);
}
}
