import java.util.Scanner;
class sum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elemnts:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		for(int i=1;i<=n;i++)
		{
		int a[]=new int[n];
		sum=sum+a[i];
		System.out.print(sum);
		}
	}
}
