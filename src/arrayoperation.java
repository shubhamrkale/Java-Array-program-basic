//To perform Addition of Even no in array
import java.io.*;
import java.lang.*;
import java.util.*;


class demo
{
	public int evensum(int no[])	//1st operation
	{
		int isum=0;
		for(int i=0;i<no.length;i++)
		{
			if(no[i]%2==0)
			{
				isum=isum+no[i];
			}
			
		}
		return isum;
	}
	
	
	public void fact(int no[])		//2nd operation
	{
		
		
		System.out.println("Factor of 15 in given array are:");
		for(int i=0;i<no.length;i++)
		{
			if(15%no[i]==0)
			{
				System.out.println(no[i]);
			}
		}
	}
	
	public boolean search(int no[]) //3rd operation
	{
		System.out.println("Enter the no that u want search:");
		Scanner s=new Scanner(System.in);
		int ino=s.nextInt();;
		
		for(int i=0;i<no.length;i++)
		{
			if(no[i]==ino)
			{
				return true;
			}
			
			
		}
		return false;
		
	
	}
	
	
}





public class arrayoperation {
public static void main(String[] args) {
	System.out.println("Enter no of elemets that u want to enter");
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int no[]=new int[size];
	System.out.println("Enter array elements");
	
	for(int i=0;i<no.length;i++)
	{
		no[i]=s.nextInt();
	}
	
	demo d=new demo();
	int result=d.evensum(no);
	
	System.out.println("Addition of ecven no in array"+result);
	
	
	d.fact(no);
	boolean a=d.search(no);
	if(a==true)
	{
		System.out.println("No present in array");
	}
	else
	{
		System.out.println("No not present");
	}
}
}
