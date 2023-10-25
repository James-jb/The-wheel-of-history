public class p65 {
    public static void main(String args[]){
get();
getSum(20, 10);
// getHe(20, 50, 30);
System.out.println(getHe(20, 50, 100));
    }

    // 普通调用
    public static void get(){
        System.out.println("啊啥地方");
    }


    // 带参数调用 实参\虚参
    public static void getSum(int num1,int num2){
        int result = num1+num2;
        System.out.println(result);
    }

    // 有返回值的 方法
    public static int getHe(int num1,int num2,int num3){
        int he =num1+num2+num3;
        return he;
    }
}