// Factory class for PDF documents
public class PdfDocumentFactory extends DocumentFactory {

    // Create PdfDocument object
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}