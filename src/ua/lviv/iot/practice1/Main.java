package ua.lviv.iot.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<Person>();
        Student student1=new Student("first-year student");
        Student student2=new Student("third-year student");
        Teacher teacher1=new Teacher("Math teacher",12000);
        Cleaner cleaner1=new Cleaner("Window-cleaner",8000);
        Teacher teacher2=new Teacher("Ukrainian teacher",15000);
        Teacher teacher3=new Teacher("English teacher",15000);

        student1.setName("Alisa");
        student2.setName("Andrew");
        teacher1.setName("Miss Williams");
        teacher2.setName("Miss Davis");
        teacher3.setName("Mr Brown");
        cleaner1.setName("Mr Miller");

        Collections.addAll(personList,student1,student2,teacher1,teacher2,teacher3,cleaner1);
        System.out.println("Person info section:");
        for (Person person:personList){
             person.print();
        }
        System.out.println();
        System.out.println("Salary section:");
        teacher1.salary();
        cleaner1.salary();
        teacher2.salary();
        teacher3.salary();


    }
}
