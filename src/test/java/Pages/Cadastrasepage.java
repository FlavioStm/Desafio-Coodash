package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cadastrasepage {
    private WebDriver navegador;
    public Cadastrasepage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Cadastrasepage cadastrase() throws InterruptedException {
        navegador.findElement(By.xpath("/html/body/div[1]/main/main/div/div/div/div/form/div[3]/div/div[3]/div/a")).click();
        //Clicar na opção Cadastro
        return this;
    }


}
