package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumGridTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() throws Exception {
        // URL of the Selenium Grid hub (adjust if necessary)
        URL gridUrl = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(gridUrl, capabilities);
    }

    @Test
    public void testHelloWorld() {
        // Access the simple web app running locally in a container
        driver.get("http://webapp:8080");
        String pageSource = driver.getPageSource();
        assertTrue(pageSource.contains("Hello, World!"), "Page should contain 'Hello, World!'");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

