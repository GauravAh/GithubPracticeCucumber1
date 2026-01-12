package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extentReports;

    public static ExtentReports getInstance(){
        if (extentReports == null) {
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target-reports/reports/aa.html");
            extentReports = new ExtentReports();
            extentReports.attachReporter(sparkReporter);
            extentReports.setSystemInfo("Browser", "Chrome");
        }
        return extentReports;
    }
}
