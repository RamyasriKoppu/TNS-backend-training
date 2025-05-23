package com.tnsif.abstraction;
//abstract class demo
abstract class Bank {
    abstract int getInterestRate();  // abstract method
}

class SBI extends Bank {
    int getInterestRate() {
        return 7;
    }
}

class ICICI extends Bank {
    int getInterestRate() {
        return 8;
    }
}




