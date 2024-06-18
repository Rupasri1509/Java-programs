public class fiboseries {
    public static void main(String[] args)
    {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<10;i++)
        {
            int sum=a+b;
            a=b;
            b=sum;
            System.out.println(b);
        }
    }
}
