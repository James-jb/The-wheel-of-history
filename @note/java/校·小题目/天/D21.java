import java.io.*;
public class D21
{
	public static void main(String args[]) throws IOException
	{
       
        String s1=new String("Helo World!");
        
    // 打印字符长度
        int len=s1.length();
        System.out.print(len);

        // 打印 字符的第几位 
        char ch=s1.charAt(5);
        System.out.print("\t"+ch);

        // 打印 o 第一个所在的位置
        int a1=s1.indexOf("o");
        System.out.print("\t"+a1);

        // 打印 o 最后一个所在的位置
        int a2=s1.lastIndexOf("x");
        System.out.print("\t"+a2);

        //5在 对象中找对象 
        String s2=new String("lo");
        System.out.print(s1.indexOf("\t" + s2));

if(s1.indexOf(s2)>=0)
System.out.print("\t"+s1);



    }
}