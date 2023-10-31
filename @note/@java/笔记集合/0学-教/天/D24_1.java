public class D24_1 {
    public static void main(String[] args) {
        int num=101;
        String str="20060320";
        // 文本数组
        String[] studentNum=new String[20];

        // 给 studentNum赋值=str+num
        for(int i =0;i<20;i++){
            studentNum[i]=str+num;
            num+=5;
        }

        // 打印
        for(int i =0;i<20;i++){
            System.out.println(studentNum[i] +" \t ");
            
        }
        }
}