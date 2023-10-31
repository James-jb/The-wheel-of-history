import java.util.StringJoiner;

public class p105 {
    public static void main(String[] args) {
// StringBuffer 类
// 场景：拼接 反转

StringBuffer sb = new StringBuffer();
// 添加
sb.append("asdf");
System.out.println(sb);
// 反转
sb.reverse();
System.out.println(sb);
// 获取长度
int len = sb.length();
System.out.println(len);

// 拼接Joiner
StringJoiner sj = new StringJoiner(",","{","}");
sj.add("aaa").add("bbb");
System.out.println(sj);




    }
}