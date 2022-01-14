package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Perfil{
    private WebDriver navegador;

    public Perfil(WebDriver navegador) {
        this.navegador = navegador;
    }
    public Perfil Selecionacarreira() throws InterruptedException  {
        Thread.sleep(2000);
        navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div/div[1]/form/div[3]/div[7]/div/div/span")).click();
        //Selecionar Carreira
        return this;

    }

    public Perfil Areatec() throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div/div[1]/form/div[4]/div/div/div[5]/span[2]/div")).click();
        // informa experiencia

        return this;
    }
    public Perfil MomentoProf() throws InterruptedException {
        Select order = new Select(navegador.findElement(By.id("preferences.job_search"))); //
        order.selectByValue("employed_and_searching");
        //Selecionar momento profissional
        return this;
    }
    public Perfil NumContato() throws InterruptedException {
        navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div/div[1]/form/div[5]/div[2]/div[1]/div[1]/input")).sendKeys("93991533096");
        //inserir numero de contato
        return this;
    }
    public Perfil InseriCidade() throws InterruptedException {
        navegador.findElement(By.id("address.city")).sendKeys("Santarém");
        return this;
    }

    public Perfil ReceberOfertas() throws InterruptedException {
        Thread.sleep(1000);
        WebElement marcachkbox = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div/div[1]/form/div[5]/div[3]/div[2]/small/div/input"));
        // identifica o elemento dentro do combobox
        marcachkbox.sendKeys(Keys.SPACE);
        return this;
    }
    public Pessoal Entraremproximo() throws InterruptedException {
        Thread.sleep(1000);
        WebElement radiobutton2 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/main/div/div/div[2]/div/div/div[1]/form/div[6]/button"));
        radiobutton2.click();
        return new Pessoal(navegador);

    }

}

