package test;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners({TestListener.class})
public class FirstTest {

    @Test
    public void testMethodOne() {
        Assert.assertFalse(true);

    }
}


