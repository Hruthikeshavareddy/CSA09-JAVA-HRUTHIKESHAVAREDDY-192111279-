import java.util.Scanner;
class  inverted
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int n=s.nextInt();
		for(int i=n;i>1;i--)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<i;k++)
				{

				System.out.print("*");
				}
				System.out.print("\n");
			}
		}

	}

