import java.util.Scanner;
class skipping 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("M=");
		int m=s.nextInt();
		System.out.print("\n"+"N=");
		int n=s.nextInt();
		System.out.print("\n"+"K=");
		int k=s.nextInt();
		for(int i=m;i<=n;i=i+k+1)
		{
			System.out.print(i+" ");
		}
	}
}
