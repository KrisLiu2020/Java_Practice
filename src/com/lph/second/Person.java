package com.lph.second;

//public class PersonTest {
//
//    public static void main(String[] args) {
//        Person p1 = new Person("Kris", 27);
//        Person p2 = new Person("Kevin", 36);
//
//        Person p3 = new Person("Dongwan", 27, true);
//    }
//}

public class Person{
    final private String name;
    final private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean isStudent){
        this.name = name;
        this.age = age;
    }

    public void eat(String name){
        System.out.println(name + " can eat.");
    }

    public void showAge(String name, int age){
        System.out.println(name + " is " + age + " years old");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Kris", 27);
        Person p2 = new Person("Kevin", 36);

        Person p3 = new Person("Dongwan", 27, true);

        System.out.println(p3.name);
        System.out.println("Christoper Thompson");
        System.out.println("Christopher Thompson");
    }
}


