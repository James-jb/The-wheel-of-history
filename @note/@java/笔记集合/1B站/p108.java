import java.util.Scanner;

public class p108 {
    public static void main(String[] args) {
// 数字 变 罗马数字

Scanner sc = new Scanner(System.in);
String str;
while(true){
    System.out.println("输入一个字符串");
    str = sc.next();
    boolean flag = checkStr(str);

    if(flag){
        break;
    }else{
        System.out.println("错误");
        continue;
    }
}
// 将数字 变成 罗马数字
// 抄表法
for(int i=0;i<str.length();i++){
    char c = str.charAt(i);
    
    int number = c - 48;

    String s = changeLouMa(number);  

    System.out.println(s);
}
}

// Ⅰ-1、Ⅱ-2、Ⅲ-3、Ⅳ-4、Ⅴ-5、Ⅵ-6、Ⅶ-7、Ⅷ-8、Ⅸ-9
public static String changeLouMa(int number){
    String[]arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
    return arr[number];
}

public static boolean checkStr(String str){
        if(str.length()>9){
            return false;
        }

        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(c<'0' || c>'9'){
                return false;
            }
        }
    return true;
}

}