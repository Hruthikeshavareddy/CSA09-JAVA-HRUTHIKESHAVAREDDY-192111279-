class primeandcomposite
{
	public static void main(String[] args) 
	{
		int arr[]={4,54,29,71,7,59,98,23};
		
		int pri=0,comp=0 ;
		for(int i=1;i<arr.length;i++)
		{
			int C=0;
			for(int j=1;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				C++;
			}
		
		if(C > 1)
		{
			comp++;
		}
		else
		{
			pri++;
		}
		}
		System.out.println("Composite number:"+comp);
		System.out.println("Prime number:"+pri);


	}
}
