import java.util.Scanner;
class Year
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of days:");
		int num=s.nextInt();
		int year=num/365;
		int week=(num%365)/7;
		int days=(num%365)%7;
		System.out.println("No.of years:"+year);
		System.out.println("No.of weeks:"+week);
		System.out.println("No.of days:"+days);

	}
}
