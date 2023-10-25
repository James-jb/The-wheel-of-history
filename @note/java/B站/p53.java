import java.util.Random;;
public class p53 {
    public static void main(String args[]){
// 生成随机数
Random r=new Random();
int number=r.nextInt(100)+1;

System.out.println("随机数 是(1-100):  "+number);
    }
}
