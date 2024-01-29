package TestNGdemo;

import org.testng.annotations.*;

public class TestNGGroup {
    @Test(groups = {"Regression","Smoke"})
    public void test(){
        System.out.println("T");

    }
    @Test(groups = {"Regression","Smoke"})
    public void test1(){
        System.out.println("Te");
    }
    @Test(groups = {"Regression"})
    public void test2(){
        System.out.println("Tes");
    }
    @Test(groups = {"Medium"})
    public void test3(){
        System.out.println("Test");
    }

}
