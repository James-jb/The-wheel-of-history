public class D24 {
    public static void main(String[] args) {
        String str1 = new String("it takes time to know a person");
        String str2 = str1.substring(5);
        String str3 = str1.substring(3,8);
        String str4 = str1.toLowerCase();//小写
        String str5 = str1.toUpperCase();//大写
        
        String str6 = str1.trim();

        // 打印
         System.out.println(str2);
         System.out.println(str3);
         System.out.println(str4);
         System.out.println(str5);
         System.out.println(str6);
    }
}
