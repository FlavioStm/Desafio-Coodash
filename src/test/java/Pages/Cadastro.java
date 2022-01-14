package Pages;

import com.mifmif.common.regex.Generex;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cadastro {
    private WebDriver navegador;
    public Cadastro(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Cadastro Inserenome() throws InterruptedException  {
        navegador.findElement(By.id("displayName")).sendKeys("Flávio Adriano Ribeiro Silva");
        //inserir nome completo
        return this;

    }
    public Cadastro Inseriremail() throws InterruptedException {
        Thread.sleep(1000);
        String regex = "\\w{5}\\@gmail\\.com";
        navegador.findElement(By.id("email")).sendKeys(new Generex(regex).random());
        //inserir email aleatório
        return this;
    }
        public Cadastro Inserirsenha() throws InterruptedException  {
            Thread.sleep(1000);
        String regex2 = "\\w{5}\\@\\1\\#\\T\\n\\${5}";
        navegador.findElement(By.id("password")).sendKeys(new Generex(regex2).random());
        //inserindo Senha aleatória
            return this;
        }
    public Cadastro Aceitatermos(Keys space) throws InterruptedException  {
        Thread.sleep(1000);
        WebElement webElement = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[2]/form/div[4]/div/input"));
    // identifica o elemento dentro do combobox
        webElement.sendKeys(Keys.SPACE);
        //Concordar com os termos password
        return this;
    }
    public Perfil Inscrever() throws InterruptedException  {
        Thread.sleep(1000);
        navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[2]/form/div[5]/div/button")).click();
        //Botão Inscrever
        return new Perfil(navegador);
    }

}
