import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

    while (true) {
        System.out.println("----- ----- 欢迎使用学生系统----- -----");

        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");


        System.out.println("输入您的选择:");
        Scanner sc=new Scanner(System.in);
        String choose = sc.next();

        switch(choose){
            case "1" :addStudent(list);break;
            case "2" :deleteStudent(list);break;
            case "3" :updateStudent(list);break;
            case "4" : queryStudent(list);break;
            case "5" :{
                System.out.print("退出");
                System.exit(0);
                break;
            }
            default: System.out.print("没有这个选项 哦!");;
        }
    }
}

// 添加学生
public static void addStudent(ArrayList<Student> list){
    Student s=new Student();

    Scanner sc=new Scanner(System.in);
    String id=null;
// 判断ID是否唯一
    while(true){
    System.out.print("输入学生的ID");
    id=sc.next();
    boolean flag =contains(list,id);
    if(flag){
        System.err.println("ID已经存在");
    }else{
        s.setId(id);
        break;
    }
}
    System.out.print("输入学生的姓名");
    String name=sc.next();
    s.setName(name);

    System.out.print("输入学生的年龄");
    int age=sc.nextInt();
    s.setAge(age);

    System.out.print("输入学生的家庭住址");
    String address=sc.next();
    s.setAddress(address);
// 添加到集合
    list.add(s);
System.out.print("添加成功了"+"\n \t");

}

// 删除学生
public static void deleteStudent(ArrayList<Student> list){
    Scanner sc=new Scanner(System.in);
    System.out.print("输入 要删除的ID");
    String id=sc.next();

    // 查询id的索引
    int index =getIndex(list, id);
    // 对index判断
    if(index >= 0){
        list.remove(index);
        System.out.println("id为"+id+"的学生删除成功");
    }else{
        System.err.println("id不存在呀!");
    }
}

// 修改学生
public static void updateStudent(ArrayList<Student> list){
    Scanner sc=new Scanner(System.in);
    System.out.print("输入 要修改的学生ID");
    String id=sc.next();

    // 判断是否存在
    int index=getIndex(list, id);
    if(index == -1){
        System.err.println("要修改的id"+id+"不存在,请重新输入");
        return;
    }

    // 输入并修改
    Student stu=list.get(index);

    System.out.println("输入学生姓名");
    String newName=sc.next();
    stu.setName(newName);

    System.out.println("输入学生年级");
    int newAge=sc.nextInt();
    stu.setAge(newAge);

    System.out.println("输入学生家庭住址");
    String newAddress=sc.next();
    stu.setAddress(newAddress);

    System.err.println("学生信息修改成功!"+"\n \t");
}

// 查询学生
public static void queryStudent(ArrayList<Student> list){
    if(list.size() == 0){
        System.out.print("现在没有学生哦!"+"\n \t");
        return;
    }
    // 打印
    System.err.println("ID\t" + "姓名\t" + "年龄\t" + "地址\t");
    for(int i=0; i<list.size();i++){
        Student stu=list.get(i);
       
        System.out.print(stu.getId()+"\t"+ stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress()+"\n");

    }
}


// 判断id是否存在
public static boolean contains(ArrayList<Student> list,String id){
    
    for(int i=0;i<list.size();i++){
        Student stu=list.get(i);
        String sid = stu.getId();
        if(sid.equals(id)){
            return true;
        }
    }

    return false;
    }

// 通过ID索引
public static int getIndex(ArrayList<Student> list,String id){
    for(int i=0;i<list.size();i++){
        // 每个学生对象
        Student stu=list.get(i);
        String sid=stu.getId();
        if(sid.equals(id)){
            return i;
        }
    }
    return -1;
}
}
