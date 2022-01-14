package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ResponderScorecard {
    private WebDriver navegador;
    private WebElement Slider;

    public ResponderScorecard(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ResponderScorecard MetodologiasÁgeisScrum() throws InterruptedException {
        Thread.sleep(1000);
        WebElement Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[1]/td/div/div[4]"));
        Actions moveSlider1 = new Actions(navegador);
        Action action1 = moveSlider1.dragAndDropBy(Slider, 250, 0).build();
        action1.perform();
        //Metodologias Ágeis / Scrum
        return this;
    }

    public ResponderScorecard Modelagemdedados() throws InterruptedException {
        Slider = navegador.findElement(By.xpath("//html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[2]/td/div/div[4]"));
        Actions moveSlider2 = new Actions(navegador);
        Action action2 = moveSlider2.dragAndDropBy(Slider, 150, 0).build();
        action2.perform();
        return this;
        //Modelagem de dados

    }

    public ResponderScorecard EstruturadeDados() throws InterruptedException {
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[3]/td/div/div[4]"));
        Actions moveSlider3 = new Actions(navegador);
        Action action3 = moveSlider3.dragAndDropBy(Slider, 350, 0).build();
        action3.perform();
        return this;
        //Estrutura de dados
    }

    public ResponderScorecard UML() throws InterruptedException {
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[4]/td/div/div[4]"));
        Actions moveSlider4 = new Actions(navegador);
        Action action4 = moveSlider4.dragAndDropBy(Slider, 450, 0).build();
        action4.perform();
        return this;
        //Uml
    }

    public ResponderScorecard Git() throws InterruptedException {
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[5]/td/div/div[4]"));
        Actions moveSlider5 = new Actions(navegador);
        Action action5 = moveSlider5.dragAndDropBy(Slider, 150, 0).build();
        action5.perform();
        return this;
        //GIT
    }

    public ResponderScorecard ComunicacaoTecnica() throws InterruptedException {
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[6]/td/div/div[4]"));
        Actions moveSlider6 = new Actions(navegador);
        Action action6 = moveSlider6.dragAndDropBy(Slider, 200, 0).build();
        action6.perform();
        return this;
        //GIT
    }

    public ResponderScorecard GestTempo() throws InterruptedException {
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[7]/td/div/div[4]"));
        Actions moveSlider7 = new Actions(navegador);
        Action action7 = moveSlider7.dragAndDropBy(Slider, 290, 0).build();
        action7.perform();
        return this;
        //Gestão de Tempo
    }

    public ResponderScorecard Logica() throws InterruptedException {
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[8]/td/div/div[4]"));
        Actions moveSlider8 = new Actions(navegador);
        Action action8 = moveSlider8.dragAndDropBy(Slider, 100, 0).build();
        action8.perform();
        return this;
        //Lógica
    }

    public ResponderScorecard Exploratorios() throws InterruptedException {
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[9]/td/div/div[4]"));
        Actions moveSlider9 = new Actions(navegador);
        Action action9 = moveSlider9.dragAndDropBy(Slider, 450, 0).build();
        action9.perform();
        return this;
        //Testes Exploratorios
    }

    public ResponderScorecard CasodeUso() throws InterruptedException {
        Slider = navegador.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/form/table/tbody/tr[10]/td/div/div[4]"));
        Actions moveSlider10 = new Actions(navegador);
        Action action10 = moveSlider10.dragAndDropBy(Slider, 350, 0).build();
        action10.perform();
        return this;
        //Casodeuso
    }

    public Scorecard2 BotaoContinuar() throws InterruptedException {
        WebElement radiobutton6 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/main/div/div/div/div/form/div/button[2]"));
        radiobutton6.click();
        //Continuar
        return new Scorecard2(navegador);
    }

}
