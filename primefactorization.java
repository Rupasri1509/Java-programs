public class primefactorization {
    public static void main(String[] args)
    {
        int a=850;
        int temp=a,i=2;
        while(temp>1)
        {
            if(checkprime(i))
            {
                if(temp%i==0)
                {
                    temp/=i;
                    System.out.println(i);
                }
                else
                {
                    i++;
                }
                
            }
            else
            {
                i++;
                continue;
            }
        }
    }
    public static  Boolean checkprime(int a)
    {
        int c=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            c++;
        }
        if(c==0)
        return true;
        else
        return false;
    }
}
