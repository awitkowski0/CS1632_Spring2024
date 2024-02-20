package edu.pitt.cs;

public class Adder {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x + y;
        System.out.println("x + y = " + z);
    }
}