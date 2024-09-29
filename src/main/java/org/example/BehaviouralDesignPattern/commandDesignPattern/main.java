package org.example.BehaviouralDesignPattern.commandDesignPattern;

import org.example.BehaviouralDesignPattern.commandDesignPattern.command.AppendingText;
import org.example.BehaviouralDesignPattern.commandDesignPattern.command.Command;

public class main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();

        Command appendRishabh = new AppendingText(receiver, "Rishabh");
        Command appendKumar = new AppendingText(receiver, "Kumar");
        receiver.getText();

        invoker.execute(appendRishabh);
        invoker.execute(appendKumar);
        invoker.undo(); // Rishabh
        invoker.redo();// Rishabh Kumar

    }
}
