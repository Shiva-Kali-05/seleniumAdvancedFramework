package com.SeleniumFramework.Test.Sample;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSample {

    @Description("Sample TC 1")
    @Test
    public void testsample()
    {
        Assert.assertTrue(true);
    }

    @Description("Sample TC 2")
    @Test
    public void testsample1()
    {
        Assert.assertTrue(true);
    }
}
