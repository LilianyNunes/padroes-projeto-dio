package com.example;

import com.example.service.ConfigurationService;

public class Main {
    public static void main(String[] args) {
        ConfigurationService configService = new ConfigurationService();

        configService.printConfiguration();

        configService.updateConfiguration("Updated Configuration");

        configService.printConfiguration();
    }
}
