import java.util.Scanner;
public class Compositenumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of composite numbers:");
		int arr[]= {16,18,27,16,23,21,19};
		int len=arr.length;
		int count=0;
		for(int i=0;i<=len;i++)
		{
			int c=0;
			for(int j=1;j<100;j++)
			{
				if(arr[i]%j==0)
				{
					c++;
				}
			}
		
		if(c>2)
			count++;
		}
		System.out.print(count);
	}
}
