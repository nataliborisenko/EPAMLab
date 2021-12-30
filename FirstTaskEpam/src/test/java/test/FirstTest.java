package test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstTest extends CommonConditions {

    @Test(testName="FirstTestName")
    public void testMethodOne() {
        Assert.assertFalse(true);

    }
}


