package com.example.designpattern.adapter.inheritance;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printString() {
        showWithAster();
    }
}
