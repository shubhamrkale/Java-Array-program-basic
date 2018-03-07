//To check whether array is palindrome or not
import java.io.*;
import java.lang.*;
import java.util.*;


class helper
{
	public boolean checkpalin(int arr[])
	{
		int i=0;
		int istart=0;
		int iend=arr.length-1;
		
		for(istart=0,iend=arr.length-1;istart<=iend;istart++,iend--)
		{
			if(arr[istart]!=arr[iend])
			{
				break;
			}
		}
		if(istart>iend)
		{
			return true;
		}
		else
		{
		return false;
		}
}
	
	
	public void second(int arr[])
	{
		int istart=0;
		int iend=arr.length-1;
		
		while(istart<=iend)
		{
			if(arr[istart]!=arr[iend])
			{
				break;
			}
			istart++;
			iend--;
		}
		
		if(istart>iend)
		{
			System.out.println("IT IS PALINDROME");
		}
		else
		{
			System.out.println("Not palindromex");
		}
	}
	
	
	
	
	
	
}










public class palindrome {
public static void main(String[] args) {
	

	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of elements");
	int size=s.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter array elements:");
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	
	helper h=new helper();
	boolean a=h.checkpalin(arr);
	if(a==true)
	{
		System.out.println("It is palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
	
	h.second(arr);
	
}
}