package com.gurparv.istbntools;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class DemoTest {

    @Test
    public void checkValidISBN(){
        ValidateISBN dt = new ValidateISBN();
        boolean result = dt.checkISBN(140449116);
        Assert.assertTrue("First value",result);
        result = dt.checkISBN(14077396);
        Assert.assertTrue("Second value",result);
    }

    @Test
    public void checkAnInvalidISBN(){
        ValidateISBN dt = new ValidateISBN();
        boolean result = dt.checkISBN(140449117);
        Assert.assertFalse(result);
    }
}
