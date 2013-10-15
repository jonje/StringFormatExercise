package com.jjensen.exercises.four;

import java.util.Formatter;

/**
 * Created with IntelliJ IDEA.
 * ProjectName: ExerciseFour
 * User: jjensen
 * Date: 10/15/13
 * Time: 8:41 AM
 */
public class Receipt {

    private final int firstColumnWidth = 15;
    private final int secondColumnWidth = 5;
    private final int thirdColumnWidth = 10;
    private final double specialWidth = 15.15;
    private final double decimalPointValue = 10.2;

    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle(){
        f.format("%-" + firstColumnWidth + "s %" + secondColumnWidth + "s %" + thirdColumnWidth + "s\n", "Item", "Qty", "Price");
        f.format("%-" + firstColumnWidth + "s %" + secondColumnWidth + "s %" + thirdColumnWidth + "s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-" +specialWidth + "s %" + secondColumnWidth + "d %" + decimalPointValue + "f\n", name, qty, price);
        total += price * qty;
    }

    public void printTotal(){
        f.format("%-" + firstColumnWidth + "s %" + secondColumnWidth + "s %" + decimalPointValue + "f\n", "Tax", "", total * 0.06);
        f.format("%-" + firstColumnWidth + "s %" + secondColumnWidth + "s %" + thirdColumnWidth + "s\n", "", "", "-----");
        f.format("%-" + firstColumnWidth + "s %" + secondColumnWidth + "s %" + decimalPointValue + "f\n", "Total", "", total * 1.06);
    }


}
