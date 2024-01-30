import java.util.Scanner;
class maxandmin
{
	public static void main(String[] args) 
	{
		int arr[]={14,16,87,36,25,89,34};
		int len=arr.length;
		for (int i=0;i<len ;i++ )
		{
			for (int j=i+1;j<len ;j++ )
			{
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}
		int m=1,n=3;
		int max=arr[len-m];
		int min=arr[n-1];
		
		System.out.println(m+"Maximum number is"+max);
		System.out.println(n+"minimum number is"+min);
		int sum=max+min;
		int diff=max-min;
		System.out.println("Sum="+sum);
		System.out.print("Difference="+diff);
	}
}
