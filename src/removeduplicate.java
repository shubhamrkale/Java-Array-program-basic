//To remove duplicate elements from array

import java.io.*;
import java.lang.*;
import java.util.*;

class remove
{
	public void duplicate(int arr[])//remove duplicate elements from array
	{
		
		int i=0;
		int j=0;
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					break;
				}
			}
				if(i==j)
				{
					System.out.println(arr[i]);
				}
		}
		
		
	}
}
















public class removeduplicate {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no of elements");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		remove r=new remove();
		r.duplicate(arr);
	}

}
