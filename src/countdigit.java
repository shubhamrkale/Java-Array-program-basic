//To count no  of digit in number
import java.io.*;
import java.util.*;
import java.lang.*;


public class countdigit 
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int ino=s.nextInt();
	int icnt=0;
	while(ino!=0)
	{
		icnt++;
		ino=ino/10;
		
	}
	
	System.out.println("No of digit in number"+icnt);
}
}
