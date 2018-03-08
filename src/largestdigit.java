//To find largest digit in no
//To find smallest digit in number

import java.util.*;

class demo
{

	public void ckeck(int ino)	//Occurances of digit simplest way
	{
	int arr[]={0,0,0,0,0,0,0,0,0,0};
	int digit;
	
	while(ino!=0)
	{
		digit=ino%10;
		arr[digit]++;
		ino=ino/10;
	}
	
	
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(+i+"\t"+arr[i]);
	}
	}
	
	
	
	
	
	
	
	
	
	public void chk(int ino)	//Print occurances of each digit
	{
		int i=0;
		int temp,icnt,digit;
		for(i=0;i<10;i++)
		{
			temp=ino;
			icnt=0;
			
			while(temp!=0)
			{
				digit=temp%10;
				if(i==digit)
				{
					icnt++;
				}
				temp=temp/10;
			}
			
			if(icnt>0)
			{
				System.out.println(+i+"\t"+icnt);
			}
		}
	}

	
	
	
	
	
	
	
	public void largest(int ino)
	{
	int imax=0;
	int digit=0;
	while(ino!=0)
	{
		digit=ino%10;
		
		if(digit>imax)
		{
			imax=digit;
		}
		if(imax==9)
		{
			break;
		}
		ino=ino/10;
		
	}
	
	System.out.println("Max digit is:"+imax);
	}
	
	
	
	
	public void small(int ino)
	{
		int imin=9;
		int digit=0;
		while(ino!=0)
		{
			digit=ino%10;
			
			if(digit<imin)
			{
				imin=digit;
			}
			if(imin==0)
			{
				break;
			}
			ino=ino/10;
			
		}
		
		System.out.println("Min digit is:"+imin);
	}
	
}










public class largestdigit {
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int ino=s.nextInt();
	demo d=new demo();
	d.largest(ino);
	d.small(ino);
	d.chk(ino);
	d.ckeck(ino);
}

}
