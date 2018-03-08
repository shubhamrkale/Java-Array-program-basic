//To find addition of digit present in number
import java.io.*;
import java.lang.*;
import java.util.*;
public class Adddigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int ino=s.nextInt();
		int digit=0,isum=0;
		while(ino!=0)
		{
			digit=ino%10;
			isum=isum+digit;
			ino=ino/10;
		}
		
		System.out.println("Addition of digit present in number"+isum);
	}
}
