package com.auxolabs.studying.ymlParser;

import com.auxolabs.studying.configurations.Configuration;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class YamlReader {
    private static Logger logger = Logger.getLogger(YamlReader.class.getName());
    public static Configuration parse() throws IOException {
        logger.setLevel(Level.FINE);
        File currentDir = new File("");
        String basepath = currentDir.getCanonicalPath();
        String relativepath = "/src/main/resources/config.yml";
        Yaml yaml = new Yaml();
        Configuration configuration = null;
        try {
            InputStream inputStream = new FileInputStream(new File(basepath+relativepath));
            configuration = yaml.loadAs(inputStream, Configuration.class);
        } catch (Exception e) {
            logger.log(Level.SEVERE,"File couldnt load\n");
        }
        return configuration;
    }
}
