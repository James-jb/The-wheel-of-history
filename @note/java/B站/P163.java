import zhuye.registJFrame;

class p163{
    public static void main(String[] args) {
        // QQ账号的比较
        String qq ="1234587";

        boolean dy =  checkQQ(qq);
        System.err.println(dy);

        // 正则表达的
        String qq2 = "132468451a2";
        System.err.println(qq2.matches("[1-9]\\d{5,19}"));
    }

    public static boolean checkQQ(String qq){

        int len = qq.length();
        // 比较 长度
        if(len <6||len>20){
            return false;
        }
        // 不是0 开头
        if(qq.startsWith("0")){
            return false;
        }

        // 全部是 数字
        for(int i=0;i <qq.length();i++){
            char c = qq.charAt(i);
            if(c < '0' || c>'9'){
                return false;
            }
        }
        
        return true;

    }
}