import java.util.*;
public class gcd {
    public static void main(String[] args)
    {
        int a;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        int c=0;
        int b=in.nextInt();
        int min=Math.min(a,b);
        for(int i=min;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println(i);
                c=i;
                break;
            }
        }
        int lcm = a*b/c;
        System.out.println(lcm);
    }
}
