import java.util.Scanner;
class Factors 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Given number:");
		int num=s.nextInt();
		System.out.println("N:");
		int n=s.nextInt();
		int a[]=new int[100];
		int x=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				a[x]=i;
				x++;
			}
		}
		System.out.println("Number of factors:"+x);
		System.out.println(n+"th factor of"+num+"="+a[n-1]);

	}
}
