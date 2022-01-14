package Pages;

import com.mifmif.common.regex.Generex;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Curriculum {
    private WebDriver navegador;
    private WebElement Slider;

    public Curriculum(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Curriculum BotaoAdicionar() throws InterruptedException {
        Thread.sleep(1000);
        WebElement radiobutton4 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/main/div[1]/div/div/div[2]/div[3]/div/button"));
        radiobutton4.click();
//Inserir Dados pessoais
        return this;
    }

    public Curriculum Behaviour() throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/form/div[1]/div[2]/input")).click();
        Thread.sleep(1000);
        WebElement wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act = new Actions(navegador);
        act.doubleClick(wb2).perform();
        //2020
        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act2 = new Actions(navegador);
        act2.doubleClick(wb2).perform();
        //2018
        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act3 = new Actions(navegador);
        act3.doubleClick(wb2).perform();
        //2016
        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act4 = new Actions(navegador);
        act4.doubleClick(wb2).perform();
        //2014
        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act5 = new Actions(navegador);
        act5.doubleClick(wb2).perform();
        //2012
        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act6 = new Actions(navegador);
        act6.doubleClick(wb2).perform();
        //2010

        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act7 = new Actions(navegador);
        act7.doubleClick(wb2).perform();

        //2008

        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act8 = new Actions(navegador);
        act8.doubleClick(wb2).perform();

        //2006

        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act9 = new Actions(navegador);
        act9.doubleClick(wb2).perform();
        //2004

        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act10 = new Actions(navegador);
        act10.doubleClick(wb2).perform();

        //2022
        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act11 = new Actions(navegador);
        act11.doubleClick(wb2).perform();

        //2000

        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act12 = new Actions(navegador);
        act12.doubleClick(wb2).perform();

        //1998
        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act13 = new Actions(navegador);
        act13.doubleClick(wb2).perform();
        //1996
        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div/span[2]"));
        Actions act14 = new Actions(navegador);
        act14.click(wb2).perform();
        //1995
        ///////////////////////***/////////////////////////////////////////////
        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/span[2]"));
        Actions act15 = new Actions(navegador);
        act15.doubleClick(wb2).perform();
//Março

        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/span[2]"));
        Actions act16 = new Actions(navegador);
        act16.doubleClick(wb2).perform();
//Maio
        wb2 = navegador.findElement(By.xpath("/html/body/div[8]/div[1]/span[2]"));
        Actions act17 = new Actions(navegador);
        act17.click(wb2).perform();
//Junho
        navegador.findElement(By.xpath("/html/body/div[8]/div[2]/div/div[2]/div/span[27]")).click();

//Dados Data de Nascimento
        return this;
    }

    public Curriculum InserirCPF() throws InterruptedException {
        Thread.sleep(1000);
        String regex3 = "([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})";
        navegador.findElement(By.id("cpf")).sendKeys(new Generex(regex3).random());
        //adicionando cpf
        return this;
    }
    public Curriculum InserirObjetivos() throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.id("summary")).sendKeys("Exercer quaisquer atividades relacionadas ao meu âmbito de vivência, de formação e acadêmico");
        //inserindo objetivos
        return this;
    }
    //Moedaevalorcontratual
    public Curriculum Clicarsalvar() throws InterruptedException {
        WebElement radiobutton5 = navegador.findElement(By.xpath("" +
                "/html/body/div[7]/div/div/div[3]/button"));
        radiobutton5.click();
        return this;
    }
    ///////////////////////Experiencia profissional//////////////////////////
    public Curriculum Botaoadicionar() throws InterruptedException {
        WebElement radiobutton9 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/main/div[2]/div/div[2]/div[4]/div/button"));
        radiobutton9.click();
        return this;
    }
    public Curriculum InserirdadosExperiencia() throws InterruptedException {
        navegador.findElement(By.id("company_name")).sendKeys("EMV Consultoria Digital");
        //inserir empresa
        navegador.findElement(By.id("title")).sendKeys("Analista de Testes Jr");
        //Cargo
        WebElement marcachkbox6 = navegador.findElement(By.xpath("//*[@id=\"is_remote\"]"));
        Actions action19 = new Actions(navegador);
        action19.moveToElement(marcachkbox6).click().perform();
//marcando a checkbox (remota)
        navegador.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/form/div/div[4]/div/input")).sendKeys("01/02/2021");
//adicionando data de inicio
        WebElement marcachkbox7 = navegador.findElement(By.xpath("//*[@id=\"currently_work_here\"]"));
        Actions action20 = new Actions(navegador);
        action20.moveToElement(marcachkbox7).click().perform();
        // Selecionando emprego atual
        navegador.findElement(By.id("description")).sendKeys("Atuando  em um projeto web fazendo planejamento de testes, escrever cenários de testes, desenvolver automação de testes com Java, teste em API com Rest Assured. Reportar bugs ao time desenvolvimento.");
        //adicionando texto de descrição
        WebElement radiobutton8 = navegador.findElement(By.xpath("" +
                "/html/body/div[7]/div/div/div[2]/form/div/div[7]/button[2]"));
        radiobutton8.click();
        //BotãoAdicionarExperiencia

        WebElement radiobutton10 = navegador.findElement(By.xpath("" +
                "/html/body/div[7]/div/div/div[3]/button"));
        radiobutton10.click();
        //BotãoSalvar

        return this;
    }
        public Curriculum Adformacao() throws InterruptedException {
            WebElement radiobutton11 = navegador.findElement(By.xpath("" +
                    "/html/body/div[1]/main/div[2]/div/div[2]/div[6]/div/button"));
            radiobutton11.click();
            // clicar no botão adicionar
            return this;
        }
    public Curriculum Adinformacoes() throws InterruptedException {
        navegador.findElement(By.id("school_name")).sendKeys("Universidade Luterana do Brasil");
        //inserir instituição
        navegador.findElement(By.id("field_study")).sendKeys("Bacharel em Sistemas de Informação");
        //inserir formação
        navegador.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/form/div/div[3]/div/input")).sendKeys("01/07/2013");
//adicionando data de inicio
        navegador.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/form/div/div[4]/div[1]/input")).sendKeys("01/01/2018");
        //data fim
        WebElement radiobutton12 = navegador.findElement(By.xpath("" +
                "/html/body/div[7]/div/div/div[2]/form/div/div[5]/button[2]"));
        radiobutton12.click();
        //clicar botão adicionar
        WebElement radiobutton14 = navegador.findElement(By.xpath("" +
                "/html/body/div[7]/div/div/div[3]/button"));
        radiobutton14.click();
        return this;
    }

    public Dashboard IrDashboard() throws InterruptedException {
        WebElement radiobutton15 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/main/div[3]/a"));
        radiobutton15.click();
        return new Dashboard(navegador);
    }

}
