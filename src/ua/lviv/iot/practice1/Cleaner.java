package ua.lviv.iot.practice1;

public class Cleaner extends Staff{
    private final String TYPE_PERSON;
    private int payment;

    public Cleaner(String TYPE_PERSON, int payment) {
        this.TYPE_PERSON = TYPE_PERSON;
        this.payment = payment;
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
