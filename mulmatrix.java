import java.util.Scanner;
class mulmatrix 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number of rows:");
		int r=s.nextInt();
		System.out.print("\n"+"Enter the number of columns:");
		int c=s.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int mul[][]=new int[r][c];
		System.out.println("Enter the 1st matrix elements:");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
				System.out.println();
			}
		}
		System.out.println("Enter the 2nd matrix elements:");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
			{
				b[i][j]=s.nextInt();
				System.out.println();
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
			{
			mul[i][j]=0;
			for(int k=0;k<c;k++)
				{
				mul[i][j]+=a[i][j]*b[i][j];
				}
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
	}
}
