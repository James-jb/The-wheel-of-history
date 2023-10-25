public class p179a {
    public static void main(String[] args) {
    //  选择排序
        int[] arr={2,4,1,3,5};
    
    // 一一比较
// 外循环
for(int j =0 ;j<arr.length-1;j++){

    // 内循环
    for(int i=j+1;i<arr.length;i++){
        // 0 和 后面比较
        if(arr[j]>arr[i]){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            }
        }
    }

    // 打印
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

    }
}
