import java.util.*;
import java.lang.Math;
class ap{
    public static void main(String[] args)
    {
        int arr[]={ 2,4,8,16,32};
        Arrays.sort(arr);
        double nth;
        int len=arr.length;
        int a=arr[0];
        double r=arr[1]/arr[0];
        Scanner in = new Scanner(System.in);
        nth=in.nextDouble();
        double n = a * Math.pow(r,(nth-1));
        double sum = (a*(Math.pow(r,nth)-1))/(r-1);
        System.out.println(sum);
        
    }
}