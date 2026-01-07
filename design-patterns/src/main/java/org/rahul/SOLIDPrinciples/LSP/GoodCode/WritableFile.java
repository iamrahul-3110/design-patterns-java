package org.rahul.SOLIDPrinciples.LSP.GoodCode;

// read and write functionality both are supported
public class WritableFile extends ReadableFile implements Writable {

    @Override
    public void write() {
        System.out.println("Writing to a file ...");
    }
}
