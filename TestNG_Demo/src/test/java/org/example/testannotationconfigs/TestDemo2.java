package org.example.testannotationconfigs;

import org.testng.annotations.Test;

@Test
public class TestDemo2 {

    public void testmethod1(){
        System.out.println("all public methods would be accessible to testNG and would behave as separate tests");
    }

    public void testmethod2(){
        System.out.println("all public methods would be accessible to testNG and would behave as separate tests");
        System.out.println("class has 2 public methods & 3 with other access modifiers, then testng report would show as below:" +
                "===============================================\n" +
                "Default Suite\n" +
                "Total tests run: 2, Passes: 2, Failures: 0, Skips: 0\n" +
                "===============================================");
    }

    private void testmethod3(){
        System.out.println("all private methods would not be accessible to testNG and would not be displayed in report");
    }
    protected void testmethod4(){
        System.out.println("all protected methods would not be accessible to testNG and would not be displayed in report");
    }

    void testmethod5(){
        System.out.println("all default methods would not be accessible to testNG and would not be displayed in report");
    }

}
