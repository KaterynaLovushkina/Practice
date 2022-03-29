package ua.lviv.iot.practice1;

public class Student extends Person{
    public final String TYPE_PERSON;

    public Student(String type_person) {
        this.TYPE_PERSON = type_person;
    }

    @Override
    public void print() {
        System.out.println("I am a "+TYPE_PERSON+", my name is "+this.getName());
    }
}
