public class P175a {
    public static void main(String[] args) {
        // 定义一个字符串
        String str = "012356789";

        // 校验 字符串
        if(str.matches( "[1-9] \\d {0,9}" )) {
            // 错误 的数据
            System.err.println("数据格式 有误");
        }else{
            // 正确 的数据
            System.out.println("数据 正确");

// 类型 转换 整数
            int number = 0;
            // 遍历
            for(int i=0;i<str.length();i++){
                int c=str.charAt(i) - '0';
                // c 表示 数字
                    // 每一位放在 number 中
                number = number * 10 + c;
            }
            // 打印
            System.err.println(number);
        }


    }
}
