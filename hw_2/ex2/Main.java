package hw_2.ex2;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.info("Connected to the database successfully");
        logger.warning("An attempt to use a deprecated method");
        logger.error("An exception occurred");
    }
}
