package com.sparta.dh.pets;

    class Pet {
        public String name;
        public int age;
        public void sound() {
            System.out.println("Animal sound");
    }
}
    class Dog extends Pet {
        public String breed;
        public void sound() {
            System.out.println("WOOF!");
        }
    }
    class Cat extends Pet {
        public String breed;

        public void sound() {
            System.out.println("MEOW!");
        }
    }
    abstract class Bird extends Pet {
        public boolean canFly;
    }

    class Parrot extends Bird {
        public void sound() {
            System.out.println("Hello!");
        }
    }

class Ostrich extends Bird {
    public void sound() {
        System.out.println("Tweet!");
    }
}

 class Demo {
    public static void main(String[] args) {

        Dog geri = new Dog();
        geri.age = 4;
        geri.breed = "Cockerpoo";
        geri.name = "Geri";

        System.out.println("Hello, my name is " + geri.name + ". I'm a " + geri.breed + " and I say "); geri.sound();

        Cat marty = new Cat();
        marty.age = 2;
        marty.name = "Marty";
        marty.breed = "Brtish Shorthair";

        System.out.println("Hello, my name is " + marty.name + ". I'm a " + marty.breed + " and I say "); marty.sound();

        Parrot peter = new Parrot();
        peter.age = 35;
        peter.name = "Peter";
        peter.canFly = true;

        System.out.println("Hello, my name is " + peter.name + ". It's " + peter.canFly + " that I can fly and I say "); peter.sound();

        Ostrich oscar = new Ostrich();
        oscar.age = 9;
        oscar.name = "Oscar";
        oscar.canFly = false;

        System.out.println("Hello, my name is " + oscar.name + ". It's " + oscar.canFly + " that I can fly and I say "); oscar.sound();

    }
}


