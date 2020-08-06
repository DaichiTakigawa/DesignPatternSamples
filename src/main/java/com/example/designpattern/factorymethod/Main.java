package com.example.designpattern.factorymethod;

import com.example.designpattern.factorymethod.framework.Factory;
import com.example.designpattern.factorymethod.framework.Product;
import com.example.designpattern.factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("takigawa daichi");
        Product card2 = factory.create("tanaka naoki");
        Product card3 = factory.create("shinonome nao");
        card1.use();
        card2.use();
        card3.use();
    }
}
