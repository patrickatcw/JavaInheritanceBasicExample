package com.me;

public class Main {

    public static void main(String[] args) {

        //step 11 creating Animal instance
        Animal animal = new Animal("Animal", 1,1, 5, 5);

        //step 12 creating Dog instance
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
        System.out.println("The dog is a " + dog.getName());

        //step 13 using methods from animal class
        dog.eat();

    }

}

//printout result;
//The dog is a Yorkie
//Dog.eat() called
//Dog.chew() called
//Animal.eat() called
