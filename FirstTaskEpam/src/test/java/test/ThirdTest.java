package test;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners({TestListener.class})
public class ThirdTest {
    @Test
    public void testMethodThird(){
        Assert.assertTrue(true);

    }
}
