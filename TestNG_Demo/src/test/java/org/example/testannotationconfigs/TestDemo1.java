package org.example.testannotationconfigs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDemo1 {

    @DataProvider(name="myParallelInputProvider",parallel = true)
    public Object[][] provideDataParallely(){
        return new Object[][]{
            {"firstname"},
            {"lastname"}
        };
    }

    @DataProvider(name="mySequentialInputProvider")
    public Object[][] provideDataSequentially(){
        return new Object[][]{
                {"firstname"},
                {"lastname"}
        };
    }

    @Test(description="simple description for atestShowcase")
    public void atestShowcase(){
        System.out.println("atestShowcase: 1st 3 test to show execution happens in alphabetical order of method name");
    }

    @Test(description="simple description for btestShowcase")
    public void btestShowcase(){
        System.out.println("btestShowcase: 1st 3 test to show execution happens in alphabetical order of method name");
    }

    @Test(description="simple description for ctestShowcase")
    public void ctestShowcase(){
        System.out.println("atestShowcase: 1st 3 test to show execution happens in alphabetical order of method name");
    }

    //Check 'TestDemo2'
    // and 'CommonAssertionDemo' class then comeback and continue from here

    @Test(description="simple description testShowcase4",priority=4, enabled = true, groups = "group2", timeOut=1000)
    public void testShowcase4(){
        System.out.println("testShowcase4 associated with group2 and should be executed before 1000 milliseconds");
        System.out.println("Lets say this method takes too much time to execute. So we use timeout to unblock next tests");
    }

    @Test(description="simple description testShowcase5",priority=5, enabled = true, groups = "group1")
    public void testShowcase5(){
        System.out.println("testShowcase5 associated with group1");
    }

    @Test(description="simple description testShowcase6",priority=6, enabled = true, dataProvider = "mySequentialInputProvider")
    public void testShowcase6(String name){
        System.out.println("testShowcase6 printing name given by sequential dataprovider: "+ name);
    }

    @Test(description="simple description testShowcase7",priority=7, enabled = true, dataProvider = "myParallelInputProvider")
    public void testShowcase7(String name){
        System.out.println("testShowcase7 printing name given by parallel dataprovider: "+ name);
    }

    @Test(description="simple description testShowcase8",priority=8, enabled = false)
    public void testShowcase8(){
        System.out.println("testShowcase8 will not run unless enabled is set to true");

    }
    @Test(description="simple description testShowcase9",priority=9, enabled = true)
    public void testShowcase9(){
        System.out.println("testShowcase9");

    }
    @Test(description="simple description for testShowcase10",priority=10, dependsOnMethods = "testShowcase9",alwaysRun=true)
    public void testShowcase10(){
        System.out.println("testShowcase10 depends on testShowcase9");
        System.out.println("testShowcase9 failed but testShowcase10 passed still");
        System.out.println("because alwaysRun is true");

    }

    @Test(description="simple description for testShowcase11",priority=11, dependsOnMethods = "testShowcase9")
    public void testShowcase11(){
        System.out.println("testShowcase11 depends on testShowcase9");
        System.out.println("testShowcase9 failed so testShowcase11 skipped");
    }

    @Test(description="simple description for testShowcase12",priority=12, dependsOnGroups = "group1", alwaysRun =true)
    public void testShowcase12(){
        System.out.println("testShowcase12 depends on group1");
        System.out.println("1 test of group1 failed/skipped or all test of group1 failed/skipped but testShowcase12 passed still");
        System.out.println("because alwaysRun is true");
    }

    @Test(description="simple description for testShowcase13",priority=13, expectedExceptions = ArithmeticException.class)
    public void testShowcase13() throws ArithmeticException{
        System.out.println("testShowcase13 will throw arithmaticexception while executing 1/0");
        System.out.println("test will pass still becaused same exception is expected in config above");
        System.out.println(1/0);
        System.out.println("testShowcase13 will throw arithmaticexception while executing 1/0");
        System.out.println("test will pass still becaused same exception is expected in config above");

    }

    //invocationCount

    //invocationTimeOut

    //successPercentage

    //singleThreaded

    //threadPoolSize
}
