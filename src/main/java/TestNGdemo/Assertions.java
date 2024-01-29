package TestNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assertions {
    @Test
    public void test() {
        // Đặt đường dẫn của GeckoDriver
        System.setProperty("webdriver.gecko.driver", "D:\\autophuong\\geckodriver.exe");

        // Khởi tạo đối tượng WebDriver
        WebDriver driver = new FirefoxDriver();

        // Mở trình duyệt và truy cập vào URL mong muốn
        driver.get("https://intertest02.kiotviet.vn/man/#/login");

        // Nhập thông tin đăng nhập
        driver.findElement(By.name("UserName")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("Kiotviet123456");

        // Nhấp vào nút đăng nhập sử dụng xpath
        driver.findElement(By.xpath("//input[@name=\"quan-ly\"]")).click();

        // Tạm dừng chương trình trong 5 giây (5000 milliseconds)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("(//a[@class=\"kv-nav-link\"])[5]")).click();
        driver.findElement(By.xpath("(//a[@href=\"/man/#/KmaManagement\"])[2]")).click();

        // Tìm phần tử iframe
        WebElement iframeElement = driver.findElement(By.id("iframe-kma"));

// Chuyển tới iframe
        driver.switchTo().frame(iframeElement);

// Tìm và thao tác với phần tử bên trong iframe
        driver.findElement(By.xpath("(//div[@class=\"menu-profile\"]/li)[5]")).click();

// Chuyển lại ngoài iframe nếu cần thiết
       // driver.switchTo().defaultContent();
        //Click vào menu nạp tiền
        //  driver.findElement(By.xpath("//*[contains(text(),'Nạp tiền')]")).click();

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // driver.findElement(By.xpath("//*[contains(text(),'Nạp tiền')]")).click();
        //driver.findElement(By.xpath("(//button[@class=\"btn btn-primary box-popup-register\"])[1]")).click();

        //chọn btn
        // driver.findElement(By.xpath("(//button[@class=\"btn-topup btn-success\"]")).click();
        //Nhâpj thong tin
        //driver.findElement(By.xpath("//div[@class=\"cash-form-money d-flex\"]/input")).sendKeys("10000");

        // driver.findElement(By.xpath("//button[@class=\"btn btn-pay\"]")).click();
        // Đóng trình duyệt
        driver.quit();
    }
}
