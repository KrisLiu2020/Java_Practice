package com.lph.first;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName,String middleName,String lastName){  //显性构造器
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Name n1 = new Name("Kris","","Liu");//
        Name n2 = new Name("Kris","","Liu");//

        System.out.println(n1.firstName);
        System.out.println(n1.middleName);
        System.out.println(n1.lastName);
    }
}
