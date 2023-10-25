public class p58 {
    public static void main(String args[]){
// 最大值 最小值

int arr[]={33,4,22,44,55};
int max=arr[0];
// 临时 认为0最大

for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}
System.out.println("最大值是:"+max);

int min=arr[0];
for(int i=0;i<arr.length;i++){
    if(arr[i]<min){
        min=arr[i];
    }
}
System.out.println("最大值是:"+min);

    }
}