package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Base {
	public WebDriver driver;
	public Properties prop;

	
	@SuppressWarnings("deprecation")
	public WebDriver IntializeDriver() throws IOException {
		
		
		
		 prop=new Properties();
		String path="\\Users\\Venu\\eclipse-workspace\\FrameworkProject\\src\\main\\java\\Resources\\Data.properties";
		
		FileInputStream file=new FileInputStream("/Users/Venu/eclipse-workspace/FrameworkProject/src/main/java/Resources/Data.properties");
		prop.load(file);
		String browserName=prop.getProperty("browser");
//		String browserName="Chrome";
		
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
			
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
			
		}
		else if (browserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}

}
