public class D25 {
    public static void main(String[] args) {
// String类的所有

    String s1="my school";
    System.out.println(s1);


    // 返回结束值
    System.out.println(s1.substring(3));

    String s2=new String();
    s2=s1.substring(3);
    System.out.println(s2);


    // 文字替换
    String s3=s1.replace("o","x");
    System.out.println(s3);



    }
}