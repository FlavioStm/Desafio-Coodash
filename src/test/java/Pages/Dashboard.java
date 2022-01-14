package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
    private WebDriver navegador;
    public Dashboard(WebDriver navegador) {
        this.navegador = navegador;
    }
    public Vagas BotaoVagas() throws InterruptedException {
        navegador.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[3]/a/div")).click();
        return new Vagas(navegador);
    }
}
