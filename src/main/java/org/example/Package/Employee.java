package org.example.Package;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {


    public Employee(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;



    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge() ;
    }
}
