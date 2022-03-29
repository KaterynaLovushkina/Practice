package ua.lviv.iot.practice2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList=new ArrayList<Animal>();
        animalList.add(new Cat("Lucy",1));
        animalList.add(new Dog("Josh",10));
        animalList.add(new Dog("Spike",5));
        animalList.add(new Cat("Princess",12));
        for(Animal item:animalList){
            item.feed();
            item.voice();
            System.out.println();
        }


    }
}
