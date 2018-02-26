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
}
