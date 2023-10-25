import java.util.Random;

public class p61 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr={1,2,3,4,5};


        for(int i=0;i<arr.length;i++){
            // 生成一个随机
            int randomIndex = r.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        
for(int i =0;i<arr.length;i++){
    System.out.print(arr[i]+" \t");
}

    }
    
}
 