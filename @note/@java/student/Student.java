// package Student;

public class Student {
    public String id;
    public String name;
    public int age;
    public String birthday;    


public Student(){}

/**
 * @param id
 * @param name
 * @param age
 * @param birthday
 */
public Student (String id,String name,int age,String birthday){
    this.id = id;
    this.name = name;
    this.age = age;
    this.birthday = birthday;
}

// get和set
public String getId(){
    return id;
}
public void setId(String id){
    this.id = id;
}


public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}


public int getAge(){
    return age;
}
public void setAge(int age){
    this.age = age;
}


public String getBirthday(){
    return birthday;
}
public void setBirthday(String birthday){
    this.birthday = birthday;
}


public String toString(){
    return "Student{id + name + age + birthday }";
}



}