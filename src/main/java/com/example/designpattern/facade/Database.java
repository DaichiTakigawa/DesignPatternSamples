package com.example.designpattern.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {
    }

    public static Properties getProperties(String dbname) {
        String filename = "src/main/resources/facade/" + dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
