import java.io.*;
public class typecasting
{
    public static void main(String [] args)
    {
        short i=5;
        String s=String.valueOf(i);
        System.out.println(s);
        int n=Integer.parseInt(s);
        System.out.println(n);
    }
}