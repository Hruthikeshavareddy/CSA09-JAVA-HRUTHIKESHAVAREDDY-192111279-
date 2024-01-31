import java.util.Scanner; 
class perfect{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter lower range:");
		int lower=sc.nextInt();  
		System.out.print("enter the upper range:");
		int upper=sc.nextInt();         
		int i=0,x=1;         
		while(i<upper) 
        { 
            int sum=0;             
			int y=x*x;             
			int t=y;            
			while(y!=0) 
            { 
                int rem=y%10;                 
				sum=sum+rem;                 
				y=y/10; 
            } 
            if(sum<10) 
            { 
                System.out.print(t+" "); 
            }             
			i=x*x;            
			x++; 
        } 
    }
}
