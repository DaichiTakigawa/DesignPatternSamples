package com.example.designpattern.factorymethod.idcard;

import com.example.designpattern.factorymethod.framework.Factory;
import com.example.designpattern.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private final List<String> owners = new ArrayList<String>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
