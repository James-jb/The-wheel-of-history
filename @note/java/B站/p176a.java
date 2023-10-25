public class p176a {
    public static void main(String[] args) {
        // 十进制 变成 二进制
        String s = toBinaryString(6);
        System.err.println(s);

        // 也可以使用
        System.err.println(Integer.toBinaryString(6));
    }

 // 除2,得到余数,为0就可以 
    public static String toBinaryString(int number){
        // 用来拼接的
        StringBuilder sb = new StringBuilder();

        while(true){
            if(number ==0){
                break;
            }

            // 获取 余数 再除以2

            int remainder = number % 2;
            // System.err.println(remainder);

            // 倒着 拼接
            sb.insert( 0, remainder);

            number = number / 2;

        }
        return sb.toString();
    }

}