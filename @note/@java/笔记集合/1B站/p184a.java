public class p184a{
    public static void main(String[] args) {
        // 不死 神兔子 11 次
        // 斐波那契 
int[] arr = new int[12];
arr[0] = 1;
arr[1] = 1;

// 负值呀
for(int i = 2 ; i<arr.length ; i++){
    arr[i] = arr[i-1] + arr[i-2];
}
// 1,1,2,3,5,8
System.err.println(arr[14]);

System.err.println(getSum(12));

    }

    // 外部方法
    public static int getSum(int month){
        if(month == 1 || month ==2){
            return 1;
        }else{
            return getSum(month - 1)+getSum(month - 2);
        }
    }

}