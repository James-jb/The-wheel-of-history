import java.util.Scanner;

public class p100 {
    public static void main(String[] args) {
    //真确的 用户 与 密码

    String rightUsername = "jb";
    String ringtPassword = "123456";

for(int i=0;i<3;i++){
    //输入 用户 密码
    Scanner sc = new Scanner(System.in);
    System.out.print("输入用户名");
    String username = sc.next();

    System.out.print("输入密码");
    String password = sc.next();

    // 比较
    if(username.equals(rightUsername) &&password.equals(ringtPassword)){
        System.out.print("用户成功");
        break;
    } else{
        System.out.print("用户登录 错误");
    }
}

    }

}
