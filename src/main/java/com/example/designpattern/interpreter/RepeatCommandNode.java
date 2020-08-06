package com.example.designpattern.interpreter;

public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        commandListNode = new CommandListNode();
        context.nextToken();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
