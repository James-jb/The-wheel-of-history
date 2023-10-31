import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p167 {
    public static void main(String[] args) throws IOException{
        // 创建URL链接
        URL url =new URL("https://www.bilibili.com");
        
        // 链接 这个网址
        URLConnection conn =url.openConnection();
        // 读取网页数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream( )));
        
        // 获取 正则表达式 对象
        String line;
        String regex = "[1-9]\\d{17}";
        Pattern pattern = Pattern.compile(regex);

        while((line = br.readLine()) != null){
            // System.out.println(line);
            // 读取 一整行
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
        br.close();
    
    }
}
