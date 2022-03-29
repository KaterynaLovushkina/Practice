package ua.lviv.iot.practice2;

public class Cat implements Animal {
    String name;
    int ageInYears;

    public Cat(String name, int ageInYears) {
        this.name = name;
        this.ageInYears = ageInYears;
    }

    @Override
    public void voice() {
        System.out.println(this.name+" says meow");
    }

    @Override
    public void feed() {
        if(this.ageInYears<3)
           System.out.println(this.name+"is fed 5 times a day");
        else if(this.ageInYears<10)
            System.out.println(this.name+"is fed 4 times a day");
        else{
            System.out.println(this.name+"is fed 3 times a day");
        }

    }
}
