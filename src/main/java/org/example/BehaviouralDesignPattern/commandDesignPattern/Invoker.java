package org.example.BehaviouralDesignPattern.commandDesignPattern;

import org.example.BehaviouralDesignPattern.commandDesignPattern.command.Command;

import java.util.Stack;

public class Invoker {
    Stack<Command> commandStack = new Stack<>();
    Stack<Command> redoStack = new Stack<>();

    public void execute(Command command){
        this.commandStack.push(command);
        command.execute();
    }

    public void undo(){
        Command lastCommand = commandStack.pop();
        lastCommand.undo();
        redoStack.push(lastCommand);
    }
    public void  redo(){
        Command redoCommand = redoStack.pop();
        redoCommand.execute();
        commandStack.push(redoCommand);
    }
}
