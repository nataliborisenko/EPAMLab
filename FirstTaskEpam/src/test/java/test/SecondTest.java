package test;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners({TestListener.class})
public class SecondTest {

    @Test
    public void testMethodSecond(){
        Assert.assertTrue(true);

    }
}
