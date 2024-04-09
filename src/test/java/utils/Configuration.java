package utils;

/**
 * Created by Anu on 09/04/24.
 */

public class Configuration {
    private String baseUrl;
    private double timeout;
    public String getBaseUrl() {
        return baseUrl;
    }

    public double getTimeout() {
        return timeout;
    }
    public enum Environment {
        LOCAL, DEV, QA, STAGING
    }
    public static Configuration getConfiguration(Environment environment) {
        switch (environment) {
            case DEV:
                return new Configuration(
                        "https://risk.lexisnexis.co.uk/",
                        10
                );

            case LOCAL:
                return new Configuration(
                        "the url of the service",
                        10
                );

            case QA:
                return new Configuration(
                        "the url of the service",
                        10
                );

            case STAGING:
                return new Configuration(
                        "the url of the service",
                        10
                );

            default:
                throw new IllegalArgumentException("Environment '" + environment + "' not known");
        }
    }

    public Configuration(String baseUrl, double timeout) {
        this.baseUrl = baseUrl;
        this.timeout = timeout;
    }
}