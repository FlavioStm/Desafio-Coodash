package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pessoal {
    private WebDriver navegador;

    public Pessoal(WebDriver navegador) {
        this.navegador = navegador;

    }

    public Pessoal SelecionarRaca() throws InterruptedException {
        Thread.sleep(1000);
        Select order2 = new Select(navegador.findElement(By.id("race"))); //
        order2.selectByValue("multiracial");
        //Selecionar Raça
        return this;
    }

    public Pessoal orietsexual() throws InterruptedException {
        Thread.sleep(1000);
        Select order3 = new Select(navegador.findElement(By.id("sexual_orientation"))); //
        order3.selectByValue("heterosexual");
        //Selecionar Orientação Sexual
        return this;
    }

    public Pessoal SelecionaGenero() throws InterruptedException {
        Thread.sleep(1000);
        Select order4 = new Select(navegador.findElement(By.id("gender"))); //
        order4.selectByValue("male");
        //Selecionar Genero
        return this;
    }

    public Pessoal SelecionaDeficiencia() throws InterruptedException {
        Thread.sleep(1000);
        Select order5 = new Select(navegador.findElement(By.id("disabilities.type"))); //
        order5.selectByValue("none");
//Deficiencia
        return this;
    }
        public Scorecard Clicarproximo() throws InterruptedException {
            Thread.sleep(1000);
            WebElement marcachkbox2 = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div/div[2]/form/div[3]/button[2]"));
            // identifica o elemento
            marcachkbox2.sendKeys(Keys.SPACE);
            return new Scorecard(navegador);


    }
}