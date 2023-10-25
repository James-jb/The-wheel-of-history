import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p166pachong {
    public static void main(String[] args) {
// 写的 内部爬虫
        String str ="java1适当放松的发多java15少"+"我都java15没事的java8";

        // 正则表的式
        Pattern p = Pattern.compile("java\\d{0,2}");

        Matcher m = p.matcher(str);

         // 运行 出来的 T\F
        boolean b = m.find();
        System.err.println(b);
       
      
        while(m.find()){
            String s1 = m.group();
            System.err.println(s1);
        }

    }
}
