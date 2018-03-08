import java.util.*;
public class reverse 
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no");
	int ino=s.nextInt();
	int temp=0;
	int digit=0,rev=0;
	temp=ino;
	while(temp!=0)
	{
		digit=temp%10;
		rev=rev*10+digit;
		temp=temp/10;
	}
	if(ino==rev)
	{
	System.out.println("No is palindrome");
	}
	else
	{
		System.out.println("No is not palindrome");
	}
	
}
}
