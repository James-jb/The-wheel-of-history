public class p179 {
    public static void main(String[] args) {
    //  排序  
            // 冒泡排序
    
        int[] arr={2,4,5,3,1};

        // 获取索引 比较
    for(int j =0;j<arr.length -1 ;j++){
        
        for(int i=0;i<arr.length -1 -j;i++){

            if(arr[i] > arr[i+1]){
                // 交换
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                }
        }
    }



        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
    
}
