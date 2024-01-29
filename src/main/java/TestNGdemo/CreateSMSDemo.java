package TestNGdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateSMSDemo {
    @Test()
    public void test(){
        System.setProperty("webdriver.gecko.driver","D:\\autophuong\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("");
    }
}
