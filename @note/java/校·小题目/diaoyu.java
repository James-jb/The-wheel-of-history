import java.io.*;
public class diaoyu
{
	public static void main(String ar[])
	{
		for(int i=6;;i++){
		int a=(i-1)/5*4;
		int b=(a-1)/5*4;
		int c=(b-1)/5*4;
		int d=(c-1)/5*4;
		if(a%5==1&&b%5==1&&c%5==1&&d%5==1&&i%5==1){
		System.out.print(i);
		break;
}
}
}
}