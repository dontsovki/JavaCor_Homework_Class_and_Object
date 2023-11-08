package org.example;

import org.example.Package.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> dataing = new ArrayList<>();
        Employee data1 = new Employee(1999.11.25);
        Employee data2 = new Employee(2006.10.23);

        dataing.add(data1);
        dataing.add(data2);


        Comparator<Employee> SortData = Comparator.comparing (Employee::getAge);
        dataing.sort(SortData);
        System.out.println(dataing);


    }
}