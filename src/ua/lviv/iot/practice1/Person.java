package ua.lviv.iot.practice1;

public abstract class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();

}
