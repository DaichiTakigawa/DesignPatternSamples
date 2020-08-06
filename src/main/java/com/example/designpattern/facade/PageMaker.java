package com.example.designpattern.facade;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprops = Database.getProperties("maildata");
            String username = mailprops.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph("this is " + username + "'s page.");
            writer.paragraph("waiting to your mail!");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
