// package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(){
        ArrayList<Student> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("----------学生管理系统(----------");
            System.out.print("1添加学生");
            System.out.print("2学生");
            System.out.print("3修改学生");
            System.out.print("4查看学生");
            System.out.print("5终止");
        
        int choice = sc.nextInt();
        // 判断
            switch (choice) {
            // 添加
            case 1:
                System.out.println("添加");
                break;
            // 删除
            case 2:
                System.out.println("删除");
                break;
            // 修改
             case 3:
                System.out.println("修改");
                break;
            // 查看
             case 4:
                System.out.println("查看");
                queryStudentInfos(List);
                break;
            // 终止 JVM 虚拟机
             case 5:
                System.out.println("退出");
                System.exit(0);   //退出
                break;
            default:
                System.out.println("输入 错误呀");
                break;
        }
    }
    }

    // 查看学生
    private static void queryStudentInfos(ArrayList<Student> list) {
        if(list.size() == 0){
            System.out.println("没有信息呀");
        }else{
            // 有信息
            for(int i =0 ;i<list.size();i++){
                Student stu = list.get(i);
                System.err.println(stu.getId() + stu.getName() + stu.getAge() );
            }
        }
    }
    
    


    
}