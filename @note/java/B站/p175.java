import java.util.ArrayList;
import java.util.Scanner;
public class p175 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
// 输入一些数据
    Scanner sc = new Scanner(System.in);
    // 判断对 与 错
        while(true){
            System.out.println("输入 整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);

            // 把 错误 数据过滤
            if(num <1 || num >100){
                System.out.println("不到1-100内");
                continue;
            }
            // 添加到集合
            list.add(num);
            // 统计 集合中的数据和
            int sum = getSum(list);

        // 对sum进行判断
        if(sum>200){
            System.out.println("所有的 数据满足 大于200");
            break;
            }
        }
 
        // 验证一下 结论
        // 打印所有
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i) + " ");
        }
        
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;

        for(int i=0;i<list.size();i++){
            int num = list.get(i);
            sum = sum + num;
        }
        return sum;
    }
}
