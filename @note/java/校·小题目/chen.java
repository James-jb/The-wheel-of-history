import java.io.IOException;

class chen {
    public static void main(String[] args)throws IOException {

        byte t[]=new byte[100000];
        System.out.println("请插入一个数：");
        System.in.read(t);
        String s1=new String(t);
        int a=Integer.parseInt(s1.trim());

        System.out.println("请插入另一个数：");
        System.in.read(t);
        String s2=new String(t);
        int b=Integer.parseInt(s2.trim());

        int c=a*b;

        System.out.println("计算结果为："+c);
    }
}