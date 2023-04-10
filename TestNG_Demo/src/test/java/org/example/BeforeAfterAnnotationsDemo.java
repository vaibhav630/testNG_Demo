package org.example;

import org.testng.annotations.*;

public class BeforeAfterAnnotationsDemo {
    @BeforeSuite
    public void beforeSuiteDemo1() {
        System.out.println("beforeSuiteDemo1");
    }

    @BeforeTest
    public void beforeTestDemo1() {
        System.out.println("beforeTestDemo1");
    }

    @BeforeGroups("group1")
    public void beforeGroupsDemo1() {
        System.out.println("beforeGroupsDemo1");
    }

    @BeforeGroups({"group1", "group2"})
    public void beforeGroupsDemo2() {
        System.out.println("beforeGroupsDemo2");
    }

    @BeforeClass
    public void beforeClassDemo1() {
        System.out.println("beforeClassDemo1");
    }

    @BeforeMethod
    public void beforeMethodDemo1() {
        System.out.println("beforeMethodDemo1");
    }

    @Test
    public void testDemo1() {
        System.out.println("testDemo1");
    }

    @Test(groups = "group1")
    public void testDemo2() {
        System.out.println("testDemo2");
    }

    @Test(groups = "group2")
    public void testDemo3() {
        System.out.println("testDemo3");
    }

    @Test(groups = {"group1", "group2"})
    public void testDemo4() {
        System.out.println("testDemo4");
    }

    @AfterMethod
    public void afterMethodDemo1() {
        System.out.println("afterMethodDemo1");
    }

    @AfterClass
    public void afterClassDemo1() {
        System.out.println("afterClassDemo1");
    }

    @AfterGroups("group2")
    public void afterGroupsDemo1() {
        System.out.println("afterGroupsDemo1");
    }

    @AfterTest
    public void afterTestDemo1() {
        System.out.println("afterTestDemo1");
    }

    @AfterSuite
    public void afterSuiteDemo1() {
        System.out.println("afterSuiteDemo1");
    }
}
