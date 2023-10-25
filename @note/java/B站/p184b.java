public class p184b {
    public static void main(String[] args) {
        // 猴子 第一天 吃了一半的 ，并多吃一个！
        // 以后每天 都吃 剩下的 ，在多吃一个，
        // 10天还没有吃（没有吃）,发现只有一个桃子了，
        // 问题：一个多少个 桃子
        
        System.err.println( getCount(10) );
    }   

    public static int getCount(int day){
        if(day <= 0 || day >= 11){
            System.err.println("时间错误");
            return -1;
        }
        if(day == 10){
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;
    }
}
