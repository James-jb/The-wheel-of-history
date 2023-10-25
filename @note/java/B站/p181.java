public class p181 {
    public static void main(String[] args) {
        // 快速排序
        int [] arr={6,1,2,7,9,3,4,5,10,8};

        // 去给值
        quickSort(arr , 0 ,arr.length-1);
        
        // 遍历 打印开始
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void quickSort(int [] arr,int i,int j){
        // 定义 俩个变量
        int start = i;
        int end = j;

        int baseNumber = arr[i];

        // 循环交换
        while(start != end){
            // 先前 先后
            while(true){
                if(end <= start || arr[end]<baseNumber){
                    break;
                }
                end--;
            }

            while(true){
                if(end <= start || arr[start]<baseNumber){
                    break;
                }
                start++;
            }

            // 交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }

        // 归位
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;








    }
}
