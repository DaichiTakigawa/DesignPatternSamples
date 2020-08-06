package com.example.designpattern.adapter.a;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        FileIO f = new FileProperties();
        try  {
            f.readFromFile("./src/main/resources/adapter/file.txt");
            System.out.println(f.getValue("year"));
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("./src/main/resources/adapter/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
