package card;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NewCardRealDeviceTest {

    public static final String USERNAME = "pipisun";
    public static final String ACCESS_KEY = "0e2855d5-ce41-4fa2-988f-581d4138d5f6";
//    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@us1.appium.testobject.com/wd/hub";
    public static final String URL = "https://us1.appium.testobject.com/wd/hub";
    AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("testobject_api_key", "2B637A2B5246433D8DE05D77063B20E2");
//        capabilities.setCapability("testobject_app_id", "#1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Samsung_Galaxy_S6_sjc_free");
        capabilities.setCapability("platformVersion", "7.0");
//        capabilities.setCapability("phoneOnly", "false");
//        capabilities.setCapability("tabletOnly", "false");
//        capabilities.setCapability("privateDevicesOnly", "false");
        capabilities.setCapability("appiumVersion", "1.10.1");

        driver = new AndroidDriver<>(new URL(URL), capabilities);


    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void getCard() {

    }
}
