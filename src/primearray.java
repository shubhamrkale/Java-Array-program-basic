//To Find perfect no from array
//To find Prime no from array
//to find no whose neaghbiour are even but that no is odd

import java.lang.*;
import java.io.*;
import java.util.*;


class primedemo
{
	public void prime(int arr[]) 	//to find prime no in array
	{
	int icnt=2;
	int i=0;
	
	for(i=0;i<arr.length;i++)
	{
		for(icnt=2;icnt<=(arr[i]/2);icnt++)
		{
			if(arr[i]%icnt==0)
			{
				break;
			}
		}
		
		if(icnt>arr[i]/2)
		{
			System.out.println("Prime no are:"+arr[i]);
		}
	}
	}
	
	public void pattern(int arr[])	//find no whose neagihbour are even n that no is odd
	{
		
		int i=0;
		for(i=1;i<arr.length-1;i++)
		{
			if((arr[i]%2!=0)&&
			   (arr[i-1]%2==0)&&
			   (arr[i+1]%2==0))
			{
				System.out.println("Series is"+arr[i-1]+"\t"+arr[i]+"\t"+arr[i+1]);
			}
		}
		
	}
	
	
	public void perfect(int arr[])
	{
		
		int isum=0;
		int i=0,icnt=0;
		
		for(i=0;i<arr.length;i++)
		{
			for(icnt=1;icnt<=(arr[i]/2);icnt++)
			{
				if(arr[i]%icnt==0)
				{
					isum=isum+icnt;
				}
			}
			if(isum==arr[i])
			{
				System.out.println("Perfect no is"+arr[i]);
			}
			
			isum=0;
			
		}
	}
	
	
	
}






class primearray
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int size=s.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		primedemo d=new primedemo();
		//d.prime(arr);
		//d.pattern(arr);
		d.perfect(arr);
	}
}