//To Check no is prime or not

import java.util.*;
import java.lang.*;
public class prime {
	public static void main(String[] args) {
		
	
	int no=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	no=s.nextInt();
	int i=0;
	for(i=2;i<=(no/2);i++)
	{
		if(no%i==0)
		{
			break;
		}
		
	}
	
	if(i>(no/2))
	{
		System.out.println("Prime no");
	}
	else
	{
		System.out.println("not prime no");
	}

}
}