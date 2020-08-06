package com.example.designpattern.prototype;

public class UnderLinePen implements Product {
    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.length();
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; ++i) {
            System.out.print(ulchar);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
