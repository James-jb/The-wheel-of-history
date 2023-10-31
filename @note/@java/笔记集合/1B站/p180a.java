
public class p180a {
    public static void main(String[] args) {
        // 递归算法
        int s =  getSum(100);
        System.err.println(s); //5050?
    }
    public static int getSum(int number){
        if(number == 1){
            return 1;
        }
        return number + getSum(number - 1);
    }
}
