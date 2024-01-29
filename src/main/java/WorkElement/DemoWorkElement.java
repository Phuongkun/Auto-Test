package WorkElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoWorkElement {
    public static WebDriver driver;
    @Test
    public void test() throws InterruptedException {
        // Đặt đường dẫn của GeckoDriver
        System.setProperty("webdriver.gecko.driver", "D:\\autophuong\\geckodriver.exe");

        // Khởi tạo đối tượng WebDriver
        driver = new FirefoxDriver();
        Thread.sleep(3000);
        // Mở trình duyệt và truy cập vào URL mong muốn
        driver.get("https://www.seleniumeasy.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // Nhấp link text
        WebElement email= driver.findElement(By.linkText("hihi"));
        WebElement pass =null;
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",email);
        Thread.sleep(3000);

    }

}
