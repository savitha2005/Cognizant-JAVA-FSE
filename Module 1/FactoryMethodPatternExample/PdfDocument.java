// Concrete class for PDF document
public class PdfDocument implements Document {

    // Implementing open() method
    @Override
    public void open() {
        System.out.println("PDF Document is opened.");
    }
}