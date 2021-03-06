package com.example.designpattern.memento;

import com.example.designpattern.memento.game.Gamer;
import com.example.designpattern.memento.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; ++i) {
            System.out.println("==== " + i);
            System.out.println("state: " + gamer);

            gamer.bet();

            System.out.println("money become " + gamer.getMoney() + ".");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("save to memento");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("restore from memento");
                gamer.restoreMemento(memento);
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
