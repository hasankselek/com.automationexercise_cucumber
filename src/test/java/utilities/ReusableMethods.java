package utilities;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;


public class ReusableMethods {

    static Actions actions = new Actions(Driver.getDriver());




    public static void bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void clickElement(String elementText) {
       WebElement webElement = Driver.getDriver().findElement(By.xpath("//*[text()='"+elementText +"']"));
        webElement.click();
    }

    public static void verifyElement(String elementText) {
        WebElement webElement = Driver.getDriver().findElement(By.xpath("//*[text()='"+elementText +"']"));
        assertTrue(webElement.isDisplayed());
    }



    public static List<String> stringListesineDonustur(List<WebElement> webelementListesi) {

        List<String> istenenStringList = new ArrayList<>();

        for (WebElement eachElement : webelementListesi
        ) {
            istenenStringList.add(eachElement.getText());
        }

        return istenenStringList;
    }

    public static void windowaGec(String hedefUrl, WebDriver driver) {
        Set<String> tumWindowlarWHDleriSeti = driver.getWindowHandles();

        for (String eachWhd : tumWindowlarWHDleriSeti
        ) {
            driver.switchTo().window(eachWhd);

            if (driver.getCurrentUrl().equals(hedefUrl)) {
                break;
            }
        }
    }


    public static void tumSayfaScreenshot(WebDriver driver) {
        // ekran resmi ismini dinamik hale getirebilmek icin
        // tarih muhru ekleyelim ekranResmi240529202344
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihMuhru = ldt.format(tarihFormati);

        // 1.adim TakeScreenshot objesi olusturalim
        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2.adim cektigimiz screenshot'i kaydedecegimiz dosyayi olusturalim
        //   dosya uzantisi jpg, jpeg, png olabilir
        //   dosya yeri  target/screenshots olsun

        File tumSayfaScreenshot = new File("target/screenshots/ekranResmi" + tarihMuhru + ".png");

        // 3.adim sayfa fotografini cekip gecici bir dosyaya yukleyelim

        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi asil olusturdugumuz dosyaya kopyalayalim

        try {
            FileUtils.copyFile(geciciDosya, tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void tumSayfaScreenshot(WebDriver driver, String raporIsmi) {
        // 1.adim TakeScreenshot objesi olusturalim
        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2.adim cektigimiz screenshot'i kaydedecegimiz dosyayi olusturalim
        File tumSayfaScreenshot = new File("target/screenshots/" + raporIsmi + ".png");

        // 3.adim sayfa fotografini cekip gecici bir dosyaya yukleyelim
        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi asil olusturdugumuz dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya, tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void webElementSS(WebElement ssCekilecekElement) {
        // dinamik hale getirmek icin tarigh muhru ekleyelim
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihMuhru = ldt.format(tarihFormati);

        // tum sayfa screenshot ile istenen weblement ss arasindaki tek fark ,
        // 1.adimda tss objesi olusturmak yerine fotograf cekmek istedigimiz
        // webelementi locate etmemizdir

        // 1.adim : fotograf cekecegimiz webelementi lcoate edelim
        // 2.adim : resmi kaydedecegimiz file ' i olusturalim
        File webElementSS = new File("target/screenshots/webelementSS" + tarihMuhru + ".png");
        // 3.adim : ss alip gecici dosyaya kaydedelim
        File geciciDosya = ssCekilecekElement.getScreenshotAs(OutputType.FILE);
        // 4.adim : gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya, webElementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void webElementSS(WebElement ssCekilecekElement, String raporIsmi) {


        // tum sayfa screenshot ile istenen weblement ss arasindaki tek fark ,
        // 1.adimda tss objesi olusturmak yerine fotograf cekmek istedigimiz
        // webelementi locate etmemizdir

        // 1.adim : fotograf cekecegimiz webelementi lcoate edelim
        // 2.adim : resmi kaydedecegimiz file ' i olusturalim
        File webElementSS = new File("target/screenshots/webelementSS" + raporIsmi + ".png");
        // 3.adim : ss alip gecici dosyaya kaydedelim
        File geciciDosya = ssCekilecekElement.getScreenshotAs(OutputType.FILE);
        // 4.adim : gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya, webElementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void verifyElementDisplayed(By by) {
        try {
            Assert.assertTrue("Element not visible: " + by, Driver.getDriver().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + by);

        }
    }

    public static void verifyElementNotDisplayed(By by) {
        try {
            Assert.assertFalse("Element should not be visible: " + by, Driver.getDriver().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();

        }
    }



    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }









}
