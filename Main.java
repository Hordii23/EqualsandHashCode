package com.company;

public class Main {



    public static void main(String[] args) {
        Rectangle r = new Rectangle("Ze",54, 54);
        Rectangle r2 = new Rectangle("Ze",54, 54);
System.out.println(r.equals(r2));
        System.out.println(r2.equals(r));
        System.out.println(r.hashCode() == r2.hashCode());
        System.out.println(r.hashCode());
        System.out.println(r2.hashCode());
    }
}
