package com.tnsif.polymorphism;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
}
    public class CompiletimePolymorphism {
        public static void main(String[] args) {
            Calculator calc = new Calculator();

            System.out.println("add(2, 3) = " + calc.add(2, 3));    
}
    }