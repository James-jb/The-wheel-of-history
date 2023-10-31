import java.util.Arrays;
import java.io.*;
public class D18
{
	public static void main(String args[]) throws IOException
	{
        float arr[]=new float[20];
        for(int i=0;i<20;i++)
        System.out.print(arr[i]+"\t");

// 填充
        System.out.print("\n设置个元素");
// 全部
        Arrays.fill(arr, 5);
        for(int i=0;i<20;i++)
        System.out.print(arr[i]+"\t");

    System.out.print("\n 从s到e 变成2");
// 指定11到15
    Arrays.fill(arr,11,15, 2);
    for(int i=0;i<20;i++)
    System.out.print(arr[i]+"\t");


// 排序
System.out.print("\n 排序");
Arrays.sort(arr);
for(int i=0;i<20;i++)
System.out.print(arr[i]+"\t");

    }
}