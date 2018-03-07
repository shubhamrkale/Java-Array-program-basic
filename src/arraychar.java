import java.util.*;
import java.lang.*;
import java.io.*;

class operation
{
	public void capital(char arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='A')&&(arr[i]<='Z'))
			{
				count++;
				System.out.println("Capital letter are:"+arr[i]);
			}
		}
		
		System.out.println("Total Capital:"+count);
	}
	
	
	
	public void firstcap(char arr[])
	{
		char temp=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='A')&&(arr[i]<='Z'))
			{
				temp=arr[i];
				break;
			}
		}
		
		System.out.println("First cap:"+temp);
		
	}
	
	
	public void lastsmall(char arr[])
	{
		char temp=arr[0];
		for(int i=arr.length-1;i>=0;i--)
		{
			if((arr[i]>='a')&&(arr[i]<='z'))
			{
				temp=arr[i];
				break;
			}
		}
		
		System.out.println("Last small charactre:"+temp);
	}
	
}
















public class arraychar {
public static void main(String[] args) {
	
	int size=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	size=s.nextInt();
	char arr[]=new char[size];
	
	
	System.out.println("Accpet character");
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.next().charAt(0);
	}
	System.out.println("Array element");
	
	
	operation o=new operation();
	o.capital(arr);
	o.firstcap(arr);
	o.lastsmall(arr);
	
}
}
