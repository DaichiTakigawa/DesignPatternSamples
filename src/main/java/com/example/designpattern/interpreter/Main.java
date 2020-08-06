package com.example.designpattern.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String text;
            while (true) {
                if ((text = reader.readLine()) != null) {
                    System.out.println("text = \"" + text + "\"");
                    Node node = new ProgramNode();
                    node.parse(new Context(text));
                    System.out.println("node = " + node);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.exit(0);
    }
}
