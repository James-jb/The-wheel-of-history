import java.io.*;
public class runnian
{
	public static void main(String args[]) throws IOException
	{
		int x;
		System.out.print("请输入年份：");
		byte t[]=new byte[10];
		System.in.read(t);
		String s1=new String(t);
		x=Integer.parseInt(s1.trim());
		if((x%4==0&&x%100!=0)||x%400==0)
		System.out.print("是");
		else
		System.out.print("不是");
	}
}