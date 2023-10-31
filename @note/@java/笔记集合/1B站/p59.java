import java.util.Random;;
public class p59 {
    public static void main(String args[]){
// 求和 并 统计个数

        int arr[]=new int[10];
        Random r = new Random();

        for(int i=0;i<arr.length;i++){
            int number=r.nextInt(100)+1;

            arr[i]=number;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
// 数据求和
int sum=0;
for(int i =0;i<arr.length;i++){
    sum=sum+arr[i];
}
System.out.println("数据的 和是："+sum);

// 平均值
int avg=sum/arr.length;
System.out.println("数据的 平均值是："+avg);



    }
}
