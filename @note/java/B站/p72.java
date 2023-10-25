import java.util.Scanner;
public class p72 {
    /**
     * @param args
     */
    public static void main(String args[]){
// 买飞机，旺季5-10|淡季 

        Scanner sc=new Scanner(System.in);
        System.out.println("输入机票 原价");
        int ticket = sc.nextInt();

        System.out.println("输入 月份");
        int mouth = sc.nextInt();

        System.out.println("购买的 作为0/1");
        int seat = sc.nextInt();

        if(mouth>5 && mouth<10){
            if(seat==0){
                ticket=(int)(ticket * 0.9);
            }else if(seat==1){
                ticket=(int)(ticket * 0.85);
            }else{
                System.out.println("输入 不合法");
            }

        }else if(mouth>=1 && mouth <=4) || (mouth>=11 && mouth<=12){
            if(seat==0){
                ticket=(int)(ticket * 0.7);
            }else if(seat==1){
                ticket=(int)(ticket * 0.65);
            }else{
                System.out.println("输入 不合法");
            }
        }else{
            System.out.println("输入 的月份不不合法");
        }
        System.out.println("你的票 是"+ticket);

        
    }
}