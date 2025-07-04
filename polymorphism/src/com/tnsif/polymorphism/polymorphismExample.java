package com.tnsif.polymorphism;
//Parent class
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

//Another Child class
class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat meows");
 }
}
public class polymorphismExample {
	public static void main(String[] args) {
        Animal a; 

        a = new Dog(); 
        a.sound();     
        a = new Cat(); 
        a.sound();     
    }
}
