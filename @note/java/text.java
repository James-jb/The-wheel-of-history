public class text {
    public static void main(String[] args) {

    }



public static String getLexMinString(String s) {
    char[] arr = s.toCharArray();
    boolean flag = false; // 标志是否需要将后面的字符全部替换为a
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 'a') {
            continue;
        }
        if (flag) {
            arr[i] = 'a';
        } else {
            arr[i] = (char)(arr[i]-1);
        }
        
        if (i < arr.length - 1 && arr[i] != 'a' && arr[i+1] != 'a') {
            flag = true;
        }
    }
    return new String(arr);
}






}
