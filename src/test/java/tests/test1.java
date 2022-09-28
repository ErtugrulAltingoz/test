package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static  void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.a101.com.tr/");
        driver.manage().window().maximize();
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.className("closePopupPersona")).click();
            
        driver.findElement(By.xpath("//a[@title='GİYİM & AKSESUAR']")).click();
        driver.findElement(By.xpath("//a[@data-value='1565']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@data-value='1567']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("lazyloaded")).click();
        driver.findElement(By.xpath("//button[@data-pk='18864']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@rel='nofollow'][1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("sepet")).click();
        driver.findElement(By.linkText("Sepeti Onayla")).click();
        driver.findElement(By.linkText("ÜYE OLMADAN DEVAM ET")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("user_email")).sendKeys("12345678@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Yeni adres oluştur")).click();
        driver.findElement(By.name("title")).sendKeys("Ev adresim");
        driver.findElement(By.name("first_name")).sendKeys("title");
        driver.findElement(By.name("last_name")).sendKeys("title");
        driver.findElement(By.name("phone_number")).sendKeys("5555555555");
        driver.findElement(By.name("city")).sendKeys("İSTANBUL");
        driver.findElement(By.name("city")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.name("township")).sendKeys("ÇATALCA");
        driver.findElement(By.name("township")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name("district")).sendKeys("A MAH");
        driver.findElement(By.className("js-district")).sendKeys(Keys.ENTER);
        driver.findElement((By.name("line"))).sendKeys(" 123.CAD CABNXWFüRİ.MAH ALSWHDFLH.SOK NO:10/11 ZXVXXV/istanbul");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class='button green js-set-country js-prevent-emoji']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@class='js-checkout-cargo-item'][1]")).click();
        driver.findElement(By.xpath("//button[@data-index='1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@data-type='gpay'][1]")).click();
        driver.findElement(By.cssSelector("input[class='checkout__contract__checkbox js-checkout-agreement']")).click();











    }


    }


