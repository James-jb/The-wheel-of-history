public class p72_1 {
    public static void main(String args[]){
        // 找 质数(101-200)
for(int i=101;i<=200;i++){
    boolean flag=true;

    for(int j=2;j<100;j++){
        if(i%j==0){
            flag=false;
            break;
        }
    }

    if(flag==true){
System.out.println("当前"+i+"的是");
    }
//     else{
// System.out.println("当前的 不是");
//     }

}
    }
}
