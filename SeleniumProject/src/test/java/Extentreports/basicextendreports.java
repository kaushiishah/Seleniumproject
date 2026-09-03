package Extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class basicextendreports {
	public static void main(String[] args) throws IOException {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark =new ExtentSparkReporter("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\report.html");
		
		
		//ExtentSparkReporter spark =new ExtentSparkReporter();
		
		extent.attachReporter(spark);
		
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
		
		extent.flush();
	}

}
