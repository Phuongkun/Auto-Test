package WorkElement;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
public class CaptureScreenshots implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        File file= ((TakesScreenshot)DemoWorkElement.driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, new File("D://"+System.currentTimeMillis()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
