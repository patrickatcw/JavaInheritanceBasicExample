package com.me;

//step 1 created Animal class
public class Animal {           //Animal is super class

        //step 4 creating fields in super class
        private String name;
        private int brain;
        private int body;
        private int size;
        private int weight;

        //step 5 creating constructor for field above
        public Animal(String name, int brain, int body, int size, int weight) {
                this.name = name;
                this.brain = brain;
                this.body = body;
                this.size = size;
                this.weight = weight;
        }
}
