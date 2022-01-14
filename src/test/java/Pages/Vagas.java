package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vagas {
    private WebDriver navegador;
    public Vagas(WebDriver navegador) {
        this.navegador = navegador;
    }
    public Vagas BotaoVagas() throws InterruptedException {
        navegador.findElement(By.name("search")).sendKeys(" PiedPiper");
        //Inserir nome de uma empresa

        navegador.findElement(By.name("location")).sendKeys("Home-Office");
        //Inserir local

        WebElement radiobutton18 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/main/div[1]/div/form/div[3]/button"));
        radiobutton18.click();
        //Clicar no botão (Encontrar)
        return this;
    }
}

