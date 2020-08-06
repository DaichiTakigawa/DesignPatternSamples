package com.example.designpattern.adapter.delegate;

import com.example.designpattern.adapter.inheritance.Banner;

public class PrintBanner extends Print {
    private final Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printString() {
        banner.showWithAster();
    }
}
