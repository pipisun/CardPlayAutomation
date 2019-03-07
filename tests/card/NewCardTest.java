package card;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NewCardTest {

    public static final String USERNAME = "pipisun";
    public static final String ACCESS_KEY = "0e2855d5-ce41-4fa2-988f-581d4138d5f6";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
    AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        Proxy proxy = new Proxy();
//        proxy.setHttpProxy("127.0.0.1:9999");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android GoogleAPI Emulator");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("app", "sauce-storage:sc.apk");
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("installLocation", "auto");
//        capabilities.setCapability("proxy", proxy);
//        capabilities.setCapability("appiumVersion", "1.10.0");
//        capabilities.setCapability("parent-tunnel","stantaylor");
//        capabilities.setCapability("tunnelIdentifier", "sauce_tunnel");
        driver = new AndroidDriver<>(new URL(URL), capabilities);


    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void getCard() {

    }
}
