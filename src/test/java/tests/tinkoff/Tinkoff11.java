package tests.tinkoff;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.xpath;

public class Tinkoff11 {

    private ChromeDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/akorsakova/Downloads/chromedriver_win32");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void TinkoffTest11() {
        driver.get("https://www.tinkoff.ru/");
        WebElement searchButton = driver.findElement(By.xpath("[href=\"/payments/"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("M46.535 60.838H35.43V49")));

        WebElement searchButton = driver.findElement(By.id("M46.535 60.838H35.43V49")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("M46.535 60.838H35.43V49")));

        WebElement regionName = driver.findElement(By.xpath("[aria-label=\"Москве")).sendKeys(Keys);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("[aria-label=\"Москве")));

        WebElement zkuMoscow = driver.findElement(By.xpath("www.cdn-tinkoff.ru/portal/brands/zhku-moskva.png")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Text__text_2Vhh9 Text__text_size_21_2umZv Text__text_sizeDesktop_40_3hWCI Text__text_align_center_AiqcR Text__text_alignDesktop_left_3806N")));

        WebElement zkuMoscowPay = driver.findElement(By.xpath("Text__text_2Vhh9 Text__text_uppercase_357sf Text__text_color_black_1lhyF Text__text_size_13_252Rj Text__text_weight_400_MSmlk")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Оплатите ЖКУ в Москве без комиссии");


//Шаг №7 ???

        WebElement searchButton = driver.findElement(By.id("M46.535 60.838H35.43V49")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("M46.535 60.838H35.43V49")));
//Шаг 9,10,11,


        WebElement searchButton = driver.findElement(By.id("M46.535 60.838H35.43V49")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("M46.535 60.838H35.43V49")));

        WebElement regionName = driver.findElement(By.xpath("[aria-label=\"Москве")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Text__text_2Vhh9 Text__text_size_21_2umZv Text__text_sizeTablet_40_3EGvx Text__text_align_center_AiqcR Text__text_alignTablet_left_uFoIK Text__text_weight_300_1uKV5 Text__text_weightTablet_200_UpIBk")));

        WebElement searchButton = driver.findElement(By.id("г. Санкт-Петербург")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Link__link_cnGq8 Link__link_color_blue_JfY21 Link__link_type_simple_2yvi8 Link__link_nodecorated_2N9sy")));

    }
    }

    @After
    public void close() {
        driver.quit();
    }


}
