package com.example.designpattern.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsname = {
            "apple", "grape", "banana", "orange",
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("money increased.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("money become half");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("fruits(" + f + ")");
            fruits.add(f);
        } else {
            System.out.println("nothing is happen");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for (String f : fruits) {
            if (f.startsWith("yummy")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "yummy";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

}
