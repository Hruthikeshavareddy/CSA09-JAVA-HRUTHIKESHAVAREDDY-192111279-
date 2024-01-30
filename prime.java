import java.util.Scanner;
class prime 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("N=");
		int n=s.nextInt();
		int a[]=new int[100];
		int x=0;
		for(int i=2;i<=100;i++ )
		{
			int fact=0;
		
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			fact++;
		}
		if(fact==2)
		{
			a[x]=i;
			x++;
	}
		}
	System.out.println(n+"rd prime is"+a[n-1]);
	System.out.println(n+"prime numbers after"+a[n-1]+"are:");
	for (int i=n;i<n+n ;i++ )
	{
		System.out.print(a[i]+"");
	}
	}
	}
