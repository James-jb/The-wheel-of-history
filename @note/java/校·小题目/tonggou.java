public class tonggou
{
	public static void main(String ar[])
	{
		long i,j,k;
 		k=10;
 		for (i=1;i<=10000;i++)
		{
			 if (i==k)
			 {
				 k*=10;
			 }
			 j=i*i;
			 if((j%k)==i) 
			{
				System.out.println(i+" "+j);
			}
		}
	}
}