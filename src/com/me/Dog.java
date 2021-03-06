package com.me;

//step 2 created Dog class
//step 3 extending Animal class
    public class Dog extends Animal{

        //step 7 create fields specific for dogs in addition to characteristics
        // in Animal super class constructor
        private int eyes;
        private int legs;
        private int tail;
        private int teeth;
        private String coat;

        //step 8 added constructor matching superclass Animal
    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

    //step 9 created new constructor with fields above and note brain and body b/c that is standard
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //step 14 adding methods
    private void chew(){

        //step 15 testing that method
        System.out.println("Dog.chew() called");

    }

    //step 16 overriding eat method
    @Override           //overriding a method in the super class
    public void eat() {
        System.out.println("Dog.eat() called");  //step 13 calling to test
        chew();                                    //step 14
        super.eat();
    }

}
