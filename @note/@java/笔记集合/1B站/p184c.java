public class p184c {
    public static void main(String[] args) {
        //  爬楼梯 有时候爬1台阶 有时候爬2台阶
        // 一共有 20 台阶，一个有多少爬法

        System.err.println( "一共有 "+ getCount(20) );
    }

    public static int getCount(int n){
        if(n == 1 ){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        return getCount(n - 1) + getCount(n - 2);
    }
}
