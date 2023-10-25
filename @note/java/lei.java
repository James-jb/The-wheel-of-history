import java.util.jar.Attributes.Name;
import com.student.Student;
import java.util.Date;

public class lei{
    public String name;
    public int age;
    public Date birthday;
    public boolean Sex;


    // 不带参 构造方法
    public Student(){
        this.Name=Name;
        this.Age=Age;
        this.Birthday=Birthday;
        this.Sex=Sex;
    }

    // 带参数 构造方法
    public Student(String name,int age,Date birthday,boolean sex){
        this.Name=Name;
        this.Age=Age;
        this.Birthday=Birthday;
        this.Sex=Sex;
    }


    // 返回 学生姓名
    public String getName(){
        return Name;
    }

    // 修改 年龄
    public String setName(String name){
        this.Name=name;
        return Name;
    }


    // 返回 学生 年龄
    public int getAge(){
        return Age;
    }

    // 修改 学生名词
    public int setAge(int age){
        this.Age=age;
        return age;
    }

    // 显示 学生所有 属性
    public void dispalyAll(){
        System.out.print(name);
        System.out.print(age);
        System.out.print(birthday);
        System.out.print(Sex);
    }
}