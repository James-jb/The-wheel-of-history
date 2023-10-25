public class p48 {
    public static void main(String args[]){

        int x=123456789;

        int num=0;
        while(x!=0){
            int ge=x%10;

            x=x/10;//纪录x的值

            num=num*10+ge;//右边 到到num

            System.out.println(x);
        }

        System.out.println("x: "+x);
        System.out.println("回数 是"+ num);
       
    }
}