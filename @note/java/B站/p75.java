import java.util.Random;;
public class p75 {
    public static void main(String[] args) {
// 随机生成 5位的验证码

// 生产 字母 到数组中
        char chs[]=new char[52];
        for(int i =0;i<chs.length;i++){
            // ASCII码
            if(i<=25){
            chs[i]=(char)(97+i);
            }else{
            chs[i]=(char)(65+i-26);
            }
        }
// 打印ASCII
        // for(int i=0;i<chs.length;i++)
        // System.out.print(chs[i]+" ");


       String result="";
        Random r=new Random();
        
 // 随机生成
        for(int i=0;i<4;i++){
        int randoIndex = r.nextInt(chs.length);
        System.out.println(chs[randoIndex]);
        }


        
    }
}
