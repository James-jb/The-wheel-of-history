import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class p9 {
// 學生隨機投票

    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList<>();

        Random r = new Random();

        for(int i = 0;i<80;i++){
            int index = r.nextInt(arr.length);
            list.add(arr[index]);

        }
        
        // 统计开始
        HashMap<String,Integer> hm = new HashMap<>();

        for (String name : list){
            if(hm.containsKey(name)){
                // 存在
                int count = hm.get(name);
                count++;
                hm.put(name, count);
            }else{
                // 不存在
                hm.put(name, 1);
            }
        }

        // 打印結構
        System.out.println(hm);

    }
}