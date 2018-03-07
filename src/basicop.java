import java.io.*;
import java.lang.*;
import java.util.*;


public class basicop {
	public static void main(String[] args) {
		
		int no[]=new int[5];
		System.out.println("Enter array element");
		
		Scanner s=new Scanner(System.in);
		for(int i=0;i<no.length;i++)
		{
			no[i]=s.nextInt();
		}
		
	System.out.println("Addition of array elemets");
		int isum=0;
		for(int i=0;i<no.length;i++)
		{
			isum=no[i]+isum;
		}
		System.out.println("Addition of array elem:"+isum);
		
		
		
		
		
		
		
	}

}
