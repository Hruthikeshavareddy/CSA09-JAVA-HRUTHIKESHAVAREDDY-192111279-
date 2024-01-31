import java.util.Scanner;
class marks 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks in python:");
		int p=sc.nextInt();
		System.out.print("\n"+"Enter the marks in c programming:");
		int c=sc.nextInt();
		System.out.print("\n"+"Enter the marks in Mathematics:");
		int m=sc.nextInt();
		System.out.print("\n"+"Enter the marks in Physics:");
		int h=sc.nextInt();
		int total=p+c+m+h;
		float agg=total/4f;
		System.out.print("\n"+"Total="+total);
		System.out.print("\n"+"Aggregation="+agg);
		if(agg>75)
		{
			System.out.print("\n"+"Distinction");
		}
		else if(agg<75 && agg>=60)
		{
			System.out.print("first division");
		}
		else if(agg<60 && agg>=50)
		{
			System.out.print("second division");
		}
		else if(agg<50 && agg>=40)
		{
			System.out.print("third division");
		}
		else
		{
			System.out.print("Fail");
		}
		
	}
}
