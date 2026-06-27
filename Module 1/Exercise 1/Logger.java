public class Logger {

    // Single instance of Logger
    private static Logger instance;

    // Private constructor
    private Logger() {
    }

    // Public method to get the single instance
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}