package org.rahul.SOLIDPrinciples.ISP.GoodCode;

import org.rahul.SOLIDPrinciples.ISP.BadCode.Document;

public class SimplerPrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the document");
    }
}
