import java.util.Arrays;
import java.io.*;

public class paixu {
    public static void main(String args[]) throws IOException
	{
        int[] arr={10,0,30,50,40,60,70,80,90,100};
        
        Arrays.sort(arr);          //排序

        System.out.println("\n 排序 ");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]+"   ");

        // Arrays.binarySearch(arr, );//搜索

        int[] b=new int[10];
        b[1]=10;

        boolean t = Arrays.equals(arr,b);//找相同
        System.out.println(t);
    }
}
