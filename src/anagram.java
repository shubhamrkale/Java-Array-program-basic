import java.util.*;

class anna
{
	public void chk(int ino1,int ino2)
	{
		int arr[]={0,0,0,0,0,0,0,0,0,0};
		int i=0;
		int digit=0;
		
		while((ino1%10!=0)&&(ino2%10!=0))
		{
			arr[ino1%10]++;
			ino1=ino1/10;
			
			arr[ino2%10]--;
			ino2=ino2/10;
		}
		
		if((ino1!=0)||(ino2!=0))
		{
			System.out.println("Bot no are of different no of digit");
		}
		
		
	for(i=0;i<arr.length;i++)
	{
		if(arr[i]!=0)
		{
			break;
		}
	}
		
		if(i==arr.length)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		
	}
	
}





public class anagram {
	public static void main(String[] args) {
		
	
Scanner s=new Scanner(System.in);
System.out.println("Enter two no");
int ino1=s.nextInt();
int ino2=s.nextInt();

anna a=new anna();
a.chk(ino1,ino2);

}
}