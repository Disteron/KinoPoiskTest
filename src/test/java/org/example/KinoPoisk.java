package org.example;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class KinoPoisk {
    /**
     * осуществление первоначальной настройки
     */

    @Test
    public void setup() {

        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        WebDriver driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage"));
        //Нажимает на кнопку "Топ 250"
        driver.findElement(By.xpath("//a[@class=\"_23NhxxXRQISbMcHJkDhY5B\" and text()=\"Топ 250\"]")).click();
        //Нажимает на Звезду
        driver.findElement(By.xpath("//p[text()=\"Интерстеллар\"]/../../../../..//button/i/..")).click();
        //Нажимаем на оценку 7
        driver.findElement(By.xpath("(//p[text()=\"Интерстеллар\"]/../../../../..//button/i/../..//div/i)[7]")).click();
        //Вписываем жанные для логина
        driver.findElement(By.xpath("//label[text()=\"Введите логин, почту или телефон\"]/../input")).sendKeys("+79651294293");
        //Нажимаем на кнопку войти
        driver.findElement(By.xpath("//span[text()=\"Войти\"]/..")).click();
        //Вписывем пароль
        driver.findElement(By.xpath("//label[text()=\"Введите пароль\"]/../input")).sendKeys("Kent7rudenkov");
        //Нажимаем на кнопку войти
        //Итог: Я сделал автотест который заходит на сайт, ставит оценку филму потом проходит авторизацию на сайте и после нее ставит оценку
        driver.findElement(By.xpath("//span[text()=\"Войти\"]/..")).click();






    }
}


