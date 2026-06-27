// Factory class for Word documents
public class WordDocumentFactory extends DocumentFactory {

    // Create WordDocument object
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}