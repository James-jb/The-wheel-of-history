public class p180 {
    public static void main(String[] args) {
        // 插入排序
        int [] arr={2,4,9915,35,48,68,48,15,99};
        // 查找 索引
        int startIndex = -1;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > arr[i+1]){
                startIndex = i+1;
                break;
            }
        }

        // 打印
        for(int i= startIndex ; i<arr.length ; i++){
            int j = i;
            while(j>0 && arr[i]<arr[j-1]){
                // 交换位置
                int temp = arr[j];
                arr[j] =arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        // 遍历开始
        for(int i=0;i<arr.length;i++){
            System.err.println(arr[i]+" ");
        }


    }
}
