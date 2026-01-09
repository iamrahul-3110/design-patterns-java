package org.rahul.BehaviouralPatterns.TemplateMethodPattern;


abstract class DataParser{ //Abstract Class or template class for defining the template method

    //Template Method Define the steps of the algorithm
    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }
    protected void openFile(){
        System.out.println("Opening File");
    }
    protected void closeFile(){
        System.out.println("Closing File");
    }
    protected abstract void parseData();
}
//CSV Parser
class CSVParserII extends DataParser{ // we are extending the abstract class DataParser so that we can use the template method parse()

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV Data");
    }
}
class JSONParserII extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON Data");
    }
}

public class WithTemplatePattern {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParserII(); // we are using the abstract class DataParser as a reference type to hold the object of CSVParserII class
        DataParser jsonParser = new JSONParserII(); // we are using the abstract class DataParser as a reference type to hold the object of JSONParserII class
        csvParser.parse();
        jsonParser.parse();
    }
}
