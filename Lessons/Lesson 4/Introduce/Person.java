package Introduce;

public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void introduce(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}
