// Abstract factory class
public abstract class DocumentFactory {

    // Factory Method
    public abstract Document createDocument();

    // Common method that uses the factory method
    public void openDocument() {

        // Create document using factory
        Document document = createDocument();

        // Open the created document
        document.open();
    }
}