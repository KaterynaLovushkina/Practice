package ua.lviv.iot.practice1;

public class Teacher extends Staff{
    private final String TYPE_PERSON;
    private int payment;

    public Teacher(String type_person, int payment) {
        this.TYPE_PERSON = type_person;
        this.payment=payment;
    }

    @Override
    public void print() {
        System.out.println("I am a "+TYPE_PERSON+", my name is "+this.getName());
    }

    @Override
    public void salary() {
        System.out.println(TYPE_PERSON+" gets "+this.payment+" in UAH");
    }
}
