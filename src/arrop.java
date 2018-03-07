import java.io.*;
import java.lang.*;
import java.util.*;

class search
{
	
	
	
	
	public void perfect(int arr[]) //perfect no from array
	{
		int isum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int icnt=1;icnt<=arr[i]/2;icnt++)
			{
				if(arr[i]%icnt==0)
				{
					isum=isum+icnt;
				}
			}
			
			if(isum==arr[i])
			{
				System.out.println("perfect no is:"+arr[i]);
			}
			
			isum=0;
		}
		
		
		
		
		
		
	}
	
	public void  addfact(int arr[])//calculate addition of  factor greater than 20
	{
		int isum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int icnt=1;icnt<=arr[i]/2;icnt++)
			{
				if(arr[i]%icnt==0)
				{
					isum=isum+icnt;
				}
				
			}
			
			if(isum>20)
			{
				System.out.println("No:"+arr[i]);
				System.out.println("Addition of factor:"+isum);
			}
			isum=0;
		}
	}
	
	
	
	
	public int search(int arr[],int no) //1st operation first occurance of no
	{
	
		for(int i=0;i<arr.length;i++)
			if(arr[i]==no)
				return i;
		
		return -1;
		}
	
	
	public int search1(int arr[],int no) //2nd operation last occurance of number
	{
		for(int i=arr.length-1;i>=0;i--)
		
			if(arr[i]==no)
				return i;
		
		return -1;
	}
	
}





public class arrop {
	
public static void main(String[] args) {
	int size;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no of elemst:");
	size=s.nextInt();
	int arr[]=new int[size];
	
	System.out.println("Enter array elements:");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	
	System.out.println("Enter no to be searched:");
	int no=s.nextInt();
	
	search a=new search();
	int d=a.search1(arr, no);
	if(d==-1)
	{
		System.out.println("Not found");
	}
	else
	{
	System.out.println("at location"+(d+1));
	}
	
	a.addfact(arr);
	a.perfect(arr);
}	
	
	

	
}
