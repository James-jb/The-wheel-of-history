public class p177a {
    public static void main(String[] args) {
        // 二分查找 
        int [] arr={7,12,32,35,40,70,100,120,130};
        System.out.println(binarySearc(arr, 100));
        
    }

    public static int binarySearc(int []arr,int number) {
        // 定义两个变量
        int min =0;
        int max =arr.length -1;

        while(true){
            if(min>max){
                return 0;
            }
        // 找中间位置
        int mid = (min + max) /2;

        // 找位置 比较
        if(arr[mid]>number){
            max = mid -1;
        }else if(arr[mid] < number){
            min = mid +1;
        }else{
            return mid;
        }
    }
    
    }
}
