import java.util.Scanner;
public class p52 {
    public static void main(String args[]){
// 指数的判断

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("输入 一个 正整数:");
            int number=sc.nextInt();

            boolean flag=true;

            for(int i=2;i<number; i++){
                if(number % i==0){
                     flag = false;
                }
                break;
            }

            if(flag==true){
                System.out.println("是质 数");
            }else{
                System.out.println("不是质 数");
            }
        }
        
    }
}
