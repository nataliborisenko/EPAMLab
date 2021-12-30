package test;

import org.testng.annotations.Test;
import org.testng.Assert;


public class SecondTest extends CommonConditions {

    @Test (testName="SecondTestName")
    public void testMethodSecond(){
        Assert.assertTrue(true);
    }
}
