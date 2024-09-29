package org.example.BehaviouralDesignPattern.commandDesignPattern;

public class Receiver {
    StringBuilder text = new StringBuilder();

     public void appendToText(String text){
        this.text.append(text);
         System.out.println("appendToText :: Current text : "+ getText());
     }
     public void deleteText(int len){
         if(len > this.text.length()){
             len = this.text.length();
         }
         this.text.delete(this.text.length() - len, this.text.length());
         System.out.println("deleteText :: Current text : "+ getText());
     }
     public String getText(){
         return this.text.toString();
     }
}
