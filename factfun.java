public class factfun {
    public static void main(String[] args)
    {
        System.out.println(fact(5));
    }
    public static int fact(int a)
    {
        if(a==0)
        return 1;
        else
        return fact(a-1)*a;
    }
}
