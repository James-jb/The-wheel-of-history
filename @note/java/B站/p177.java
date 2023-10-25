public class p177 {
    public static void main(String[] args) {
        // 基本查找
        int [] arr = {131,128,146,81,45,3,1};
        int number =3;
        System.err.println(BasiSearch(arr,number));
    }

    public static Integer BasiSearch(int []arr,int number){
        // 用基本查询 数组是否存在

        for(int i=0;i<arr.length;i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }



}