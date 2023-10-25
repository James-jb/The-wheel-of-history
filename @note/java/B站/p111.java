import java.util.ArrayList;
import java.util.List;
public class p111 {

    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    System.out.print(list);

    // 增加
    boolean result = list.add("aaa bbb\n");
    System.out.print(result);
    
    // 删除
    list.remove("aaa");
    System.out.print(result);

    // 修改
    String result1=list.set(0, "ddd");
    System.out.println(result1); 

    // 查询
    // Object re2 = List.get(0);
    // System.out.println(re2); 

    }   
}
