import java.util.Scanner;
class vowels 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String b=sc.nextLine();
		int len=b.length();
		char a[]=new char[len];
		int vow=0;
		
		for(int i=0;i<len;i++)
		{
			a[i]=b.charAt(i);
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
				vow+=1;
		}
		System.out.print("\n"+"Number of Vowels:"+vow);
				
	}
}


