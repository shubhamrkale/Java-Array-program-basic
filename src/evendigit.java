
import java.util.*;
public class evendigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int ino=s.nextInt();
		int digit=0,ieven=0,iodd=0;
		while(ino!=0)
		{
			digit=ino%10;
			if(digit%2==0)
			{
				ieven++;
			}
			else
			{
				iodd++;
			}
			
			ino=ino/10;
		}
			System.out.println("Even digit are"+ieven);
			System.out.println("Odd digit are"+iodd);
	}
			
			
	}