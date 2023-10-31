import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class p5 {
    public static void main(String[] args) {
        // 第二种遍历
        // 通过 值键对

        // 1创建
        Map<String,String> map =new HashMap<>();

        // 2添加元素
        map.put("null", "null");
        map.put("asdf", "null2");
        map.put("nullas", "123");

        // 3
        Set<Map.Entry<String,String>> entries = map.entrySet();

        // 遍历 
        for(Map.Entry<String,String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" +value);
        }

    }   
}
