package com.jjensen.exercises.four;

public class Main {

    public static void main(String[] args) {
	    Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three bears porridge", 1, 14.29);
        receipt.printTotal();
    }
}
