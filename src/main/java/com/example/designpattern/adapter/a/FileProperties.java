package com.example.designpattern.adapter.a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String filename) throws IOException {
        FileInputStream in = new FileInputStream(filename);
        load(in);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        FileOutputStream out = new FileOutputStream(filename);
        store(out, null);

    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
