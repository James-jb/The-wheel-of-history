import java.util.ArrayList;

public class p156sxhs {
public static void main(String[] args) {
    // 水仙花数

        int count = 0;
        for(int i =100; i<=999 ; i++){
            int ge =  i%10;
            int shi = i/10%10;
            int bai = i/100%10;

            // 判断
        Double sum = Math.pow(ge, 3)+Math.pow(shi, 3)+Math.pow(bai, 3);
        if(sum == i){
            count++;
            System.err.println("水仙花数"+i);
            }
        }
        System.out.println("一共有"+count+"个");

    }    
}