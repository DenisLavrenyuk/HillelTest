package lessons.l12;

import org.example.lesson12.configuration.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstRunBrowser extends BaseClass {
    public static void main(String[] args) {
        driver.get("https://google.com");
    }
}
