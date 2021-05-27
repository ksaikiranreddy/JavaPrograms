import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class SeleniumLinksVerify {

    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        HttpURLConnection huc=null;
        String url="";

        driver.get("https://sports.coral.co.uk");

        List<WebElement> links= driver.findElements(By.tagName("a"));

        for(WebElement link:links)
        {
            url=link.getAttribute("href");

//            if (url==null)
//            {
//                System.out.println("This URL is empty"+url);
//            }

            try
            {
                huc=(HttpURLConnection)(new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                int respCode=huc.getResponseCode();
                if (respCode>=400)
                {
                    System.out.println(url+"is broken link");
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        driver.quit();
    }

}
