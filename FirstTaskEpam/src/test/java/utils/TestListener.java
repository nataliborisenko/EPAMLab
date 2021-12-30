package utils;

import org.apache.logging.log4j.*;
import org.testng.*;
import org.testng.annotations.Test;
import java.lang.reflect.Method;


public class TestListener implements ITestListener {
    private final Logger logger = LogManager.getRootLogger();

    public void onTestStart(ITestResult result) {
        Method method = result.getMethod().getConstructorOrMethod().getMethod();
        String nameOfMyTest = method.getAnnotation(Test.class).testName();
        logger.info(nameOfMyTest);
    }

    public void onTestSuccess(ITestResult result) {
        logger.info("Test " + result.getInstanceName() + " finished successfully");
    }

    public void onTestFailure(ITestResult result) {
        logger.error("Test " + result.getInstanceName() + " failed ");
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
}

