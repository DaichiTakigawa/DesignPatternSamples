package com.example.designpattern.bridge.a;

import com.example.designpattern.bridge.DisplayImpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileDisplayImpl extends DisplayImpl {
    private String filename;
    private InputStream in;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            in = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawPrint() {
        System.out.println(in.toString());
    }

    @Override
    public void rawClose() {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
