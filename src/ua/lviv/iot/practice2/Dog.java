package ua.lviv.iot.practice2;

public class Dog implements Animal {
    String name;
    int ageInYears;

    public Dog(String name, int ageInYears) {
        this.name = name;
        this.ageInYears = ageInYears;
    }

    @Override
    public void voice() {
        System.out.println(this.name+" barks");
    }

    @Override
    public void feed() {
        if(this.ageInYears<5)
            System.out.println(this.name+"is fed 6 times a day");
        else if(this.ageInYears<15)
            System.out.println(this.name+"is fed 5 times a day");
        else {
            System.out.println(this.name + "is fed 3 times a day");
        }

    }
}
