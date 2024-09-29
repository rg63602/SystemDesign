package org.example.BehaviouralDesignPattern.commandDesignPattern.command;

import org.example.BehaviouralDesignPattern.commandDesignPattern.Receiver;

public class AppendingText implements Command{
    Receiver receiver;
    String text;
    public AppendingText(Receiver receiver, String text){
        this.receiver = receiver;
        this.text = text;
    }
    @Override
    public void execute() {
        receiver.appendToText(text);
    }

    @Override
    public void undo() {
        receiver.deleteText(text.length());
    }
}
