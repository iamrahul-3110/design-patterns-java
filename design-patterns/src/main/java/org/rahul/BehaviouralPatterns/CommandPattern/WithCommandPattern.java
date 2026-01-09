package org.rahul.BehaviouralPatterns.CommandPattern;

//Command Interface
interface Command { // creating a command interface to encapsulate a request as an object
    void execute();
}

//Concrete Classes for Commands
class BoldCommand implements Command{ // implementing the command interface for bold action
    private TextEditorII editor;

    public BoldCommand(TextEditorII editor){
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.boldText();
    }
}

class ChangeColor implements Command{ // implementing the command interface for change color action
    private TextEditorII editor;

    public ChangeColor(TextEditorII editor){
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.changeColor();
    }
}


//Button Class
class Button{ // Invoker class that will invoke the command which is decoupled from the receiver
    private Command command; // reference to command interface

    public void setCommand(Command command){
        this.command = command;
    }
    public void click(){ // method to execute the command when button is clicked
        command.execute(); // runtime polymorphism to call the execute method of the concrete command class
    }
}


// Receiver: TextEditor class
class TextEditorII {
    public void boldText() {
        System.out.println("Text has been bolded.");
    }

    public void italicizeText() {
        System.out.println("Text has been italicized.");
    }

    public void underlineText() {
        System.out.println("Text has been underlined.");
    }

    public void changeColor(){
        System.out.println("Text color has been changed");
    }
}

public class WithCommandPattern {
    public static void main(String[] args) {
        TextEditorII editorII = new TextEditorII();

        //Button
        // Decoupling -> One button can do many types of actions, decoupled from the text editor!
        Button button = new Button();
        button.setCommand(new BoldCommand(editorII));
        button.setCommand(new ChangeColor(editorII));
        button.click();

    }
}
