import java.util.Scanner;
class  pattern
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
			{
					System.out.print("*"+"");
		}
		System.out.println();
		}

	}
}

