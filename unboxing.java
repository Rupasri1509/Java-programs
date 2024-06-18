import java.io.*;
import java.util.*;
public class unboxing
{
	public static void main(String [] args)
	{
		int a=10;
		Integer b=a;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		int c=arr.get(0);
		System.out.println(c);
	}
}