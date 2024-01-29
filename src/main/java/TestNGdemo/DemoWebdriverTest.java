package TestNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoWebdriverTest {
    @Test
    public void test() throws InterruptedException {
        // Đặt đường dẫn của GeckoDriver
        System.setProperty("webdriver.gecko.driver", "D:\\autophuong\\geckodriver.exe");

        // Khởi tạo đối tượng WebDriver
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(3000);
        // Mở trình duyệt và truy cập vào URL mong muốn
        driver.get("https://intertest02.kiotviet.vn/man/#/login");

        // Nhập thông tin đăng nhập// driver.findElement(By.name("UserName")).sendKeys("admin");
        WebElement userName= driver.findElement(By.name("UserName"));
        userName.sendKeys("admin");
        //dong này tương đương với  2 dòng dưới //driver.findElement(By.name("Password")).sendKeys("Kiotviet123456");
        WebElement password= driver.findElement(By.name("Password"));
        password.sendKeys("Kiotviet123456");


        // Nhấp vào nút đăng nhập sử dụng xpath
        driver.findElement(By.xpath("//input[@name=\"quan-ly\"]")).click();

        // Tạm dừng chương trình trong 5 giây (5000 milliseconds)
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[text()='admin'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[text()='Hồ sơ gian hàng'])[2]")).click();
        //Click vào menu nạp tiền
        //  driver.findElement(By.xpath("//*[contains(text(),'Nạp tiền')]")).click();
        Thread.sleep(3000);


       // driver.findElement(By.xpath("//*[contains(text(),'Nạp tiền')]")).click();

        // Tìm phần tử iframe
        WebElement iframeElement = driver.findElement(By.id("iframe-kma"));

        // Chuyển tới iframe
        driver.switchTo().frame(iframeElement);
        // Chờ đợi cho một phần tử trong iframe xuất hiện (thay "your_xpath" bằng xpath của phần tử cần thao tác)
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //WebElement elementInIframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("your_xpath")));
        Thread.sleep(3000);
        // Thực hiện thao tác trên phần tử
        //elementInIframe.click();
        // Tìm và thao tác với phần tử bên trong iframe chọn button nạp tiền
        driver.findElement(By.xpath("(//div[@class=\"menu-profile\"]/li)[5]")).click();
        //chọn btn
        Thread.sleep(5000);
        //driver.switchTo().frame(iframeElement);
        // chọn button nạp tiền trong màn nạp tiền
        driver.findElement(By.xpath("//button[@class=\"btn-topup btn-success\"]")).click();
        // Chọn nạp zalo
        driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[2]")).click();
        //Nhập số tiền muốn nạp
        driver.findElement(By.xpath("//div[@class=\"cash-form-money d-flex\"]/input")).sendKeys("10000");
        // Chọn phương thuwcs thanh toán cash
        driver.findElement(By.xpath("(//ul[@class=\"upgrade-items\"]/li)[2]")).click();
        // Chọn thanh toán
       driver.findElement(By.xpath("//button[@class=\"btn btn-pay\"]")).click();
        // Đóng trình duyệt
        //driver.quit();
    }
}
