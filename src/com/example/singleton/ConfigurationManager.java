package com.example.singleton;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String configuration;

    private ConfigurationManager() {

        this.configuration = "Initial Configuration";
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }


    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
