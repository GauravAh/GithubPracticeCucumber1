package utils;

import base.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    static String screenShotPath = System.getProperty("user.dir") + "/target-reports/reports/screenshots/";
    private static WebDriver driver;

    public static String takeScreenshot(String screenShotName){

        driver = DriverFactory.getDriver();

        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String fileName = screenShotName.replaceAll(" " , "_") + "_" +
                timeStamp + ".png";

        String destinationPath = screenShotPath + fileName;

        try {
            File srcFile = ((TakesScreenshot)driver)
                    .getScreenshotAs(OutputType.FILE);
            File destFile = new File(destinationPath);
            FileUtils.copyFile(srcFile,destFile);
        }catch (Exception e){
            e.printStackTrace();
        }
        return destinationPath;
    }

}
