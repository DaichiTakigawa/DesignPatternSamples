package com.example.designpattern.factorymethod.idcard;

import com.example.designpattern.factorymethod.framework.Product;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println(owner + "'s card was created.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "'s card was used.");
    }

    public String getOwner() {
        return owner;
    }
}
