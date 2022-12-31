package rough;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class T2 {

	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		extent.createTest("LoginTest").log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		extent.createTest("AddProductTest").log(Status.INFO, "This is a logging event for MyFirstTest, and it passed!");
		extent.flush();

	}

}
