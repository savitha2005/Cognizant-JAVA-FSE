// Concrete class for Excel document
public class ExcelDocument implements Document {

    // Implementing open() method
    @Override
    public void open() {
        System.out.println("Excel Document is opened.");
    }
}