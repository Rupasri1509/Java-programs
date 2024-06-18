public class prime1to100 {
    public static void main(String[] args)
    {
        for(int i=2;i<101;i++)
        {
            if(isprime(i))
            System.out.println(i);
        }
    }
    public static Boolean isprime(int a)
    {
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
            return false;
            }
            
        }
        return true;
    }
}