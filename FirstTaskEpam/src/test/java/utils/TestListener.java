package utils;

import org.apache.logging.log4j.*;
import org.testng.*;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class TestListener implements ITestListener {
    private final Logger logger = LogManager.getRootLogger();

    public void onTestStart(ITestResult result) {
            }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test " + result.getName() + " finished successfully");
    }

    public void onTestFailure(ITestResult result) {
        logger.info ("Test " + result.getName() + " failed" + getCurrentTimeAsString());
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
    }

    private String getCurrentTimeAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd_HH-mm-ss");
        return ZonedDateTime.now().format(formatter);
    }
}

