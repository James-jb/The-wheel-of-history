import java.util.Scanner;
import java.io.*;
public class P32
{
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException
	{
        // 输入的
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入 3位 整数:");
        // String sc = new Scanner(System.in).next();

    int number=sc.nextInt();

        int g=number %10;
        int s=number/10 %10;
        int b=number/100 %10;

        System.out.println("个位是"+g);
        System.out.println("十 位是"+s);
        System.out.println("百  位是"+b);
    }
}