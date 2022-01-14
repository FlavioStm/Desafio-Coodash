package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scorecard {
    private WebDriver navegador;

    public Scorecard(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ResponderScorecard ResponderAgora() throws InterruptedException {
        WebElement marcachkbox3 = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[2]/a"));
        // identifica o elemento
        Thread.sleep(1000);
        marcachkbox3.sendKeys(Keys.ENTER);
        return new ResponderScorecard(navegador);
    }
}

