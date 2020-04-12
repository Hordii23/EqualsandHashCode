package com.company;

public class Main {



    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("Ze",54, 54);
        Rectangle r2 = new Rectangle("Ze",54, 54);
System.out.println(r1.equals(r2));
        System.out.println(r2.equals(r1));
        System.out.println(r1.hashCode() == r2.hashCode());
        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());
    }
}
