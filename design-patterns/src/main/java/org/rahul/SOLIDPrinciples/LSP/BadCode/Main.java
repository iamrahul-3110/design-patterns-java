package org.rahul.SOLIDPrinciples.LSP.BadCode;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile(); // object of child class assigned to parent class reference
        file.read(); //works fine
        file.write(); // throwing an exception, violation of LSP

    }
}
