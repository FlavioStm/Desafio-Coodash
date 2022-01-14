package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Scorecard2 {
    private WebDriver navegador;
    private WebElement Slider;

    public Scorecard2(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Scorecard2 Behaviour() throws InterruptedException {
        Thread.sleep(4000);
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[1]/td/div/div[4]"));
        Actions moveSlider12 = new Actions(navegador);
        Action action111 = moveSlider12.dragAndDropBy(Slider, 150, 0).build();
        action111.perform();
        return this;
        //Behaviour
    }

    public Scorecard2 TestDriven() throws InterruptedException {
        Thread.sleep(1000);
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[2]/td/div/div[4]"));
        Actions moveSlider13 = new Actions(navegador);
        Action action12 = moveSlider13.dragAndDropBy(Slider, 200, 0).build();
        action12.perform();
        return this;
    }
    public Scorecard2 UnitTests() throws InterruptedException {
        Thread.sleep(1000);
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[3]/td/div/div[4]"));
        Actions moveSlider14 = new Actions(navegador);
        Action action13 = moveSlider14.dragAndDropBy(Slider, 290, 0).build();
        action13.perform();
        return this;
        //UnitTests
    }
    public Scorecard2 TestCoverage() throws InterruptedException {
        Thread.sleep(1000);
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[4]/td/div/div[4]"));
        Actions moveSlider15 = new Actions(navegador);
        Action action14 = moveSlider15.dragAndDropBy(Slider, 100, 0).build();
        action14.perform();
        return this;
        //TestCoverage
    }
    public Scorecard2 AutomaçãodeTestes() throws InterruptedException {
        Thread.sleep(1000);
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[5]/td/div/div[4]"));
        Actions moveSlider16 = new Actions(navegador);
        Action action15 = moveSlider16.dragAndDropBy(Slider, 450, 0).build();
        action15.perform();
        return this;
        //TestCoverage
    }
    public Scorecard2 PlanejamentodeTestes() throws InterruptedException {
        Thread.sleep(1000);
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[6]/td/div/div[4]"));
        Actions moveSlider17 = new Actions(navegador);
        Action action16 = moveSlider17.dragAndDropBy(Slider, 350, 0).build();
        action16.perform();
        return this;
        //P.deTestes
    }
    public Scorecard2 ARequisitos() throws InterruptedException {
        Thread.sleep(1000);
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[7]/td/div/div[4]"));
        Actions moveSlider18 = new Actions(navegador);
        Action action17 = moveSlider18.dragAndDropBy(Slider, 350, 0).build();
        action17.perform();
        return this;
        //Análise de requisitos
    }

    public Curriculum botaocontinuar() throws InterruptedException {
        Thread.sleep(1000);
        WebElement radiobutton7 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/main/div/div/div/div/form/div/button[2]"));
        radiobutton7.click();
        return new Curriculum(navegador);
        //Ir para pagina curriculum
    }


}
