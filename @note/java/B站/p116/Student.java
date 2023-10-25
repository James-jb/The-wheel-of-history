public class Student{
// id anme age address

private String id;
private String name;
private int age;
private String address;

public Student(){}
public Student(String id,String name,int age,String address){
    this.id=id;
    this.name=name;
    this.age=age;
    this.address=address;
}
// id
public String getId(){
    return id;
}
public void setId(String id){
    this.id=id;
}

// name
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}

// age
public Integer getAge(){
    return age;
}
public void setAge(Integer age){
    this.age=age;
}

// address
public String getAddress(){
    return address;
}
public void setAddress(String address){
    this.address=address;
}

}