import java.io.*;
public class inputs {
    public static void main(String args[]) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String s=b.readLine();
        int a = Integer.parseInt(b.readLine());
        System.out.println(s+a);
    }
}
