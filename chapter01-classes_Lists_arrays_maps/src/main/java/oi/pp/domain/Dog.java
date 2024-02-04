package oi.pp.domain;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author panpan
 */
public class Dog {
    public static void makeNoise() {
        System.out.println("Bark!");
    }

    public static void main(String[] args) {
        //Dog.makeNoise();
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = new Dog();
        Arrays.stream(dogs).forEach(dog -> dog.makeNoise());
    }
}