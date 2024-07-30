package com.example.service;

import com.example.singleton.ConfigurationManager;

public class ConfigurationService {

    public void printConfiguration() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Current Configuration: " + configManager.getConfiguration());
    }

    public void updateConfiguration(String newConfig) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        configManager.setConfiguration(newConfig);
    }
}
