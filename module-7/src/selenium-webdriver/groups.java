package web3;

import org.testng.annotations.Test;

public class groups {

    @Test(groups="smoke")
    public void test1(){
        System.out.println("Smoke Test Case");
    }

    @Test(groups="regression")
    public void test2(){
        System.out.println("Regression Test Case");
    }
}

