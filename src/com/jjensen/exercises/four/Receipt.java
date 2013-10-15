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
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle(){
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%15.15s %4d %10.2f\n", name, qty, price);
        total += price * qty;
    }

    public void printTotal(){
        f.format("%-15s %5s %10.2f\n", "Tax", "", total * 0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-15s %5s %10.2f\n", "Total", "", total * 1.06);
    }


}
