// Main class to test Factory Method Pattern
public class FactoryMethodTest {

    public static void main(String[] args) {

        // Create Word factory
        DocumentFactory wordFactory = new WordDocumentFactory();

        // Open Word document
        wordFactory.openDocument();

        // Create PDF factory
        DocumentFactory pdfFactory = new PdfDocumentFactory();

        // Open PDF document
        pdfFactory.openDocument();

        // Create Excel factory
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        // Open Excel document
        excelFactory.openDocument();
    }
}