package com.example.designpattern.abstractfactory.listfactory;

import com.example.designpattern.abstractfactory.factory.Item;
import com.example.designpattern.abstractfactory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");
        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
