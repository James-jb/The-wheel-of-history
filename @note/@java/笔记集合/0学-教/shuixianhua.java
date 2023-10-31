import java.util.Scanner;
public class shuixianhua
{
	public static void main(String ar[])
	{
		for(int m=100;m<=999;m++)
		{
			int k=m/100;
			int j=(m/10)%10;
			int i=m%(k*10+j);
			if(Math.pow(k,3)+Math.pow(j,3)+Math.pow(i,3)==m)
			System.out.print(+m+"是水仙数");
		}
}

}