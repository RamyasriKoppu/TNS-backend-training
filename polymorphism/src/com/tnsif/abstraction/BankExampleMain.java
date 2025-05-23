package com.tnsif.abstraction;

public class BankExampleMain {
	
	    public static void main(String[] args) {
	        Bank b1 = new SBI();
	        Bank b2 = new ICICI();
	        
	        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
	        System.out.println("ICICI Interest Rate: " + b2.getInterestRate() + "%");
	    }
	}

