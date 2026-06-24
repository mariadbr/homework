package hw_2.ex1;

class ConfigurationManager {
    private String databaseUrl = "default url";
    private String databaseUser = "default user";
    private String databasePassword = "default password";

    private String storagePath = "default storage path";

    private String logLevel = "default log level";
    private String logFilePath = "default log file path";

    private static ConfigurationManager configurationManager;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public void displayConfig() {
        System.out.println(databaseUrl);
        System.out.println(databaseUser);
        System.out.println(databasePassword);
        System.out.println(storagePath);
        System.out.println(logLevel);
        System.out.println(logFilePath);
    }

}
