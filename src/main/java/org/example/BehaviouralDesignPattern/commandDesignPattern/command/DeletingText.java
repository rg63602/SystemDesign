package org.example.BehaviouralDesignPattern.commandDesignPattern.command;

import org.example.BehaviouralDesignPattern.commandDesignPattern.Receiver;

public class DeletingText implements Command{
    Receiver receiver;
    String text;

    DeletingText(Receiver receiver, String text){
        this.receiver = receiver;
        this.text = text;
    }
    @Override
    public void execute() {
        receiver.deleteText(text.length());
    }

    @Override
    public void undo() {
        receiver.appendToText(text);
    }
}
