public class noofdigit {
    public static void main(String[] args)
    {
        int no=25,base=1,count=0;
        String s1=String.valueOf(no);
        System.out.println(s1.length());
        while(true)
        {
            if((no)>base*10)
            {
                base=base*10;
                count+=1;
            }
            else{
                count+=1;
                break;
            }
            
        }
        System.out.println(count);
    }
}
