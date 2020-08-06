package com.example.designpattern.builder;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("===============================\n");
        buffer.append("[").append(title).append("] \n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String string) {
        buffer.append("*").append(string).append("\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("  .").append(item).append("\n");
            buffer.append("\n");
        }
    }

    @Override
    public void close() {
        buffer.append("===============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
