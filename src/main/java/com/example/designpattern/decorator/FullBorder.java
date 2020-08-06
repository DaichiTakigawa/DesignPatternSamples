package com.example.designpattern.decorator;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 2 + display.getColumns();
    }

    @Override
    public int getRows() {
        return 2 + display.getRows();
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int count) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
