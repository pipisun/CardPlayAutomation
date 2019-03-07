package card;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class NewCardRealDeviceTest {

    public static final String USERNAME = "pipisun";
    public static final String ACCESS_KEY = "0e2855d5-ce41-4fa2-988f-581d4138d5f6";
//    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
    public static final String URL = "https://us1.appium.testobject.com/wd/hub";
    AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Proxy proxy = new Proxy();
//        proxy.setHttpProxy("127.0.0.1:9999");
        capabilities.setCapability("testobject_api_key", "2B637A2B5246433D8DE05D77063B20E2");
//        capabilities.setCapability("testobject_app_id", "#1");
        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Samsung_Galaxy_S6_sjc_free");
        capabilities.setCapability("deviceName", "Motorola_Moto_E2_real_us");
//        capabilities.setCapability("platformVersion", "7.0");
//        capabilities.setCapability("phoneOnly", "false");
//        capabilities.setCapability("tabletOnly", "false");
//        capabilities.setCapability("privateDevicesOnly", "false");
        capabilities.setCapability("appiumVersion", "1.10.1");
//        capabilities.setCapability("tunnelIdentifier", "Unnamed tunnel");
//        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        capabilities.setCapability("proxy", proxy);

        driver = new AndroidDriver<>(new URL(URL), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void login() throws InterruptedException {
//        (new TouchAction<>(driver)).tap(PointOption.point(702, 2266)).perform();
//        (new TouchAction<>(driver)).tap(PointOption.point(1105, 1497)).perform();
        Thread.sleep(5000);
        (new TouchAction(driver)).tap(PointOption.point(265, 854)).perform();
        Thread.sleep(30000);
        (new TouchAction(driver)).tap(PointOption.point(269, 666)).perform();
        (new TouchAction(driver)).tap(PointOption.point(265, 836)).perform();
        (new TouchAction(driver)).tap(PointOption.point(335, 854)).perform();
        (new TouchAction(driver)).tap(PointOption.point(296, 811)).perform();

        for(int i=0; i<6; i++) {
            (new TouchAction(driver)).tap(PointOption.point(271, 805)).perform();
            Thread.sleep(1000);
        }
    }
}
