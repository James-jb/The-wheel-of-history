import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class p4 {
    public static void main(String[] args) {
        // Map集合的第一种遍历方法
        // 通过 键 找 值

        // 1创建MAP集合
        Map<String,String> map =new HashMap<>();

        // 2添加元素
        map.put("null", "null");
        map.put("asdf", "null2");
        map.put("nullas", "123");

        // 3通过键 找 值
        // 3.1获取 键
        Set<String> Keys = map.keySet();
        // 3.2遍历集合，得到每一个值
        for(String key : Keys){
            // 3.3 map获取get
            String value = map.get(key);
            System.out.println(key +"="+value);
            
        }

    }
}
