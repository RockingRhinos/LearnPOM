package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverInstance {
	
	private static final ThreadLocal<RemoteWebDriver> obj = new ThreadLocal<RemoteWebDriver>();

	public void getDriver() {
		obj.get();
	}
	
	public void setDriver(String str) {
		obj.set(new ChromeDriver());
	}

	
}
