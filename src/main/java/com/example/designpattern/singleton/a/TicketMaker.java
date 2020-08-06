package com.example.designpattern.singleton.a;

public class TicketMaker {
    private static TicketMaker instance = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {
    }


    public TicketMaker getInstance() {
        return instance;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}
