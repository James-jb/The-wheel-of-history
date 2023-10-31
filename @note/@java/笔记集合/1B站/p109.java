public class p109 {
    public static void main(String[] args) {
        String strA ="abcde";
        String strB ="edcba";

        // 旋转
        // String rotate = rotate (strA);
        boolean result = check(strA, strB);
        System.out.print(result);
    }
 
// 方法
public static boolean check(String strA,String strB){
    for(int i=0; i<strA.length(); i++){
        strA=rotate(strA);

        if(strA.equals(strB)){
return true;
        }
    
    }
    return false;
}


public static String rotate(String str){
    // 第一个
    char frist = str.charAt(0);

    // 剩余
    String end = str.substring(1);

    return end + frist;
}

}
