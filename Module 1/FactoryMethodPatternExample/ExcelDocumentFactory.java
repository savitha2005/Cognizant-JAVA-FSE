// Factory class for Excel documents
public class ExcelDocumentFactory extends DocumentFactory {

    // Create ExcelDocument object
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}