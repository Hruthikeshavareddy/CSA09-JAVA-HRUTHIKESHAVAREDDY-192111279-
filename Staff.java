import java.util.Scanner;
class Staff
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Total users:");
		int a=s.nextInt();
		System.out.println("Staff users:");
		int b=s.nextInt();
		int c=b/3;
		int d=a-(b+c);
		System.out.println("Student users:"+d);
	}
}
