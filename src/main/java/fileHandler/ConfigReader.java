package fileHandler;

import enums.BrowserDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static final String CONFIG_FILE_PATH = "config.properties";
    FileInputStream fileInputStream = null;
    Properties property;

    public ConfigReader() {
        try {
            fileInputStream = new FileInputStream(new File(CONFIG_FILE_PATH));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        property = new Properties();
        try {
            property.load(fileInputStream);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BrowserDriver getBrowser()
    {
        String browser = property.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            return BrowserDriver.CHROME;
        }

        else if (browser.equalsIgnoreCase("firefox")) {
            return BrowserDriver.FIREFOX;
        }

        else if (browser.equalsIgnoreCase("ie")) {
            return BrowserDriver.INTERNET_EXPLORER;
        }

        else if (browser.equalsIgnoreCase("opera")) {
            return BrowserDriver.OPERA;
        }

        else {
            return BrowserDriver.CHROME;
        }

    }

    public String getAppUrl() {
        return property.getProperty("appUrl");
    }

    public Integer getTimeout() {
        return Integer.valueOf(property.getProperty("timeout"));
    }
}
