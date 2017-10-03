package com.auxolabs.studying.application;

import com.auxolabs.studying.configurations.Configuration;
import com.auxolabs.studying.ymlParser.YamlReader;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    private static Logger logger = Logger.getLogger(Application.class.getName());
    public static void main(String args[]) throws IOException {
        logger.setLevel(Level.FINE);
        Configuration configuration = YamlReader.parse();
        logger.log(Level.INFO,"Hello "+ configuration.name+"\n"+configuration.message);
    }
}
