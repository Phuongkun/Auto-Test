package TestNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lecture04 {
    @Test
    public void test() throws InterruptedException {
        // Đặt đường dẫn của GeckoDriver
        System.setProperty("webdriver.gecko.driver", "D:\\autophuong\\geckodriver.exe");

        // Khởi tạo đối tượng WebDriver
        WebDriver driver = new FirefoxDriver();
        // Mở trình duyệt và truy cập vào URL mong muốn
        driver.get("https://intertest02.kiotviet.vn/man/#/login");

         //Nhập thông tin đăng nhập// driver.findElement(By.name("UserName")).sendKeys("admin");
        WebElement userName = driver.findElement(By.name("UserName"));
        userName.sendKeys("admin");
        //dong này tương đương với  2 dòng dưới //driver.findElement(By.name("Password")).sendKeys("Kiotviet123456");
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("Kiotviet123456");
        // submit uông đương phi enter
        WebElement quanly =driver.findElement(By.xpath("//input[@name=\"quan-ly\"]"));
        quanly.click();
       // driver.findElement(By.xpath("//input[@name=\"quan-ly\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[text()='admin'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[text()='Hồ sơ gian hàng'])[2]")).click();
        Thread.sleep(4000);
        // Tìm phần tử iframe
        WebElement iframeElement = driver.findElement(By.id("iframe-kma"));

        // Chuyển tới iframe
        driver.switchTo().frame(iframeElement);
        Thread.sleep(5000);
        
        WebElement text = driver.findElement(By.xpath("(//div[@class=\"price-description\"])[1]"));
        Thread.sleep(3000);
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(),"Dành cho mô hình kinh doanh nhỏ, người bắt đầu kinh doanh hoặc bán hàng online.");
    }
}
