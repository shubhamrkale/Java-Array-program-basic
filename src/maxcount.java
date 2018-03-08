import java.io.*;
import java.util.*;
import java.lang.*;

class srk
{

	public static void max(int ino)
	{
		int i=0,digit;
		int max=0,j=0;
		int arr[]={0,0,0,0,0,0,0,0,0,0};
		
		while(ino!=0)
		{
			digit=ino%10;
			arr[digit]++;
			ino=ino/10;
		}
		
		for(i=0;i<arr.length;i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
				j=i;
			}
		}
		
		
	
		
		System.out.println(+j+"\t"+max);

	
		
	}
	
	
}




public class maxcount {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ino=s.nextInt();
		
		srk.max(ino);
	}

}
