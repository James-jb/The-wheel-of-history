import java.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;
public class p6 {
    public static void main(String[] args) {
        // 第3种遍历
        // Lambda表达式

        // 1创建
        Map<String,String> map =new HashMap<>();

        // 2添加元素
        map.put("鲁迅", "null");
        map.put("曹操", "老骥伏枥，志在千里，幸甚至哉，歌以咏志");
        map.put("刘备", "123");
        map.put("阿斯顿", "123");


        // 遍历
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value){
                System.out.println(key + "=" +value);
            }
        });
    

        // lamadba表达式
map.forEach( (key, value)-> System.out.println(key + "=" +value));
      


    }   
}
