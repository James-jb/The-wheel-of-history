// package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[]arges){
        
        // 测试数据
        Student stu1 =new Student("01" , "战士" , 23 , "2004-04-16");

        ArrayList<Student> List = new ArrayList<>();
        List.add(stu1);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------学生管理系统(----------");
            System.out.println("1添加学生");
            System.out.println("2删除学生");
            System.out.println("3修改学生");
            System.out.println("4查看学生");
            System.out.println("5终止");
        
        int choice = sc.nextInt();
        // 判断
            switch (choice) {
            // 添加
            case 1:
                System.out.println("添加");
                addStudent(List);
                break;

            // 删除
            case 2:
                System.out.println("删除");
                deleteStudent(List);
                break;

            // 修改
             case 3:
                System.out.println("修改");
                updateStudent(List);
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
                System.out.println("输入 数字 错误呀");
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
    
    // 找索引
    private static int getIndex(String id, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
     // 删除学生
    private static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生ID：");
        String id = sc.nextLine();
    
        int index = getIndex(id, list);
        if (index != -1) {
            list.remove(index);
            System.out.println("学生删除成功！");
        } else {
            System.out.println("找不到该学生ID，删除失败！");
        }
    }

    // 修改学生
private static void updateStudent(ArrayList<Student> list) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入要修改的学生ID：");
    String id = sc.nextLine();

    int index = getIndex(id, list);
    if (index != -1) {
        Student student = list.get(index);

        System.out.println("请输入新的学生姓名：");
        String name = sc.nextLine();
        student.setName(name);

        System.out.println("请输入新的学生年龄：");
        int age = sc.nextInt();
        student.setAge(age);

        System.out.println("学生信息修改成功！");
    } else {
        System.out.println("找不到该学生ID，修改失败！");
    }
}

// 添加学生
private static void addStudent(ArrayList<Student> list) {
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入学生ID：");
    String id = sc.nextLine();

    System.out.println("请输入学生姓名：");
    String name = sc.nextLine();

    System.out.println("请输入学生年龄：");
    int age = sc.nextInt();
    
    sc.nextLine(); // 读取换行符

    System.out.println("请输入学生生日（YYYY-MM-DD）：");
    String birthday = sc.nextLine();

    Student student = new Student(id, name, age, birthday);
    list.add(student);

    System.out.println("学生添加成功！");
}

}