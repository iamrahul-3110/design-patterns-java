package org.rahul.SOLIDPrinciples.LSP.GoodCode;

public class Main {

    public static void readAnyFile(ReadableFile file){
        file.read();
    }

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile(); // Object of ReadOnlyFile assigned to ReadableFile reference
        readableFile.read();

        WritableFile writableFile = new WritableFile(); // Object of WritableFile assigned to WritableFile reference
        writableFile.read();
        writableFile.write();

        readAnyFile(readableFile); // reading readOnlyFile using readAnyFile method
        readAnyFile(writableFile); // reading writableFile using readAnyFile method
    }
}
