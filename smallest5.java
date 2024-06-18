import java.util.*;
import java.lang.*;
public class smallest5{
    public static void main(String[] args)
    {
        int[] a = {10,6,85,4,23}; //time complexity O(nlogn)
        Arrays.sort(a);
        System.out.println(a[0]);
    }
}