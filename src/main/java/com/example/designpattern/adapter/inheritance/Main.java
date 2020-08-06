package com.example.designpattern.adapter.inheritance;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeek();
        p.printString();
    }
}
