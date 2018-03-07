import java.lang.*;
import java.io.*;
import java.util.*;

class max
{
	
	
	public void maximum(int arr[])// for finding minimum and maximum and 2nd max 2nd min
	{
		int min=arr[0];
		int min1=min;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>min)
			{
				min1=min;
				min=arr[i];
			}
			else if((arr[i]>min1)&&(arr[i]!=min))
			{
				min1=arr[i];;
			}
		}
		
		System.out.println("2 ndMinimum no is:"+min1);
	}
	
}





public class arrayop1 {
public static void main(String[] args) {
	
	int size=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of elements");
	size=s.nextInt();
	
	int arr[]=new int[size];
	
	System.out.println("Enter array elemsnts");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	
	max m=new max();
	m.maximum(arr);
	
}
	
	
}
