package Pages;
//Flavio Adriano Ribeiro Silva

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver navegador;

    public HomePage(WebDriver navegador) {
        this.navegador = navegador;
    }

    @Test
    public HomePage validapagina() throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.id("SVGcandidatemobile"));
        //navegar até o elemento SOU DEVELOPER
        navegador.findElement(By.className("sr-only"));
        //navegar até o elemento (Cubo) no canto inferior esquerdo
        navegador.findElement(By.className("u-header__nav-link"));
        //navegar até o elemento no canto inferior
        return this;
    }

    public Cadastrasepage Clicalogin() throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.xpath("/html/body/div[1]/header/div/div/nav/div[2]/ul/li[3]/a/button")).click();
        //entrar na pagina de login

        return new Cadastrasepage(navegador);
    }
}


