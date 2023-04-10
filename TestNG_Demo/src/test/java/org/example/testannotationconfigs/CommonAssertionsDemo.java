package org.example.testannotationconfigs;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class CommonAssertionsDemo {
    public boolean pos =true;
    public boolean neg=false;
    public String nulla = null;
    public String str = "CheckMeOut";
    public void testMethod1(){

        System.out.println("Simplest 3");
        Assert.assertEquals(str,"CheckMeOut");
        Assert.assertTrue(pos);
        Assert.assertNull(nulla);

        System.out.println("Opposite of Above 3");
        Assert.assertNotEquals(str,"CheckMeOutAgain");
        Assert.assertFalse(neg);
        Assert.assertNotNull(str);

        System.out.println("All these assertions have overloaded implementations to show messages in case of failures as shown in next 6 tests");
        System.out.println("AssertEquals and AssertNotEquals assertions have overloaded implementations to compare values of each type");

    }

    public void testMethod2(){
        Assert.assertEquals(str,"CheckMeOutFail", "message will print on failure as actual: "+str +" and expected: CheckMeOutFail  are not same values");
    }

    public void testMethod3(){
        Assert.assertTrue(neg, "message will print on failure as actual: "+neg +" and expected: True");

    }

    public void testMethod4(){
        Assert.assertNull(str,"message will print on failure as actual: "+str +"  and expected: null");
    }

    public void testMethod5(){
        Assert.assertNotEquals(str,"CheckMeOut", "message will print on failure as actual: "+str +" and expected: not equal to CheckMeOut");
    }

    public void testMethod6(){
        Assert.assertFalse(pos, "message will print on failure as actual: "+pos +" and expected: False");

    }

    public void testMethod7(){
        Assert.assertNotNull(nulla,"message will print on failure as actual: "+nulla +"  and expected: not null");
    }

}
