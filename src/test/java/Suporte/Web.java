package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

        public static WebDriver creatChrome(){
            System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
            //abrindo o navegador / Avaliador observe onde está seu drive
            WebDriver navegador = new ChromeDriver();
            navegador.manage().window().maximize();
            navegador.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            navegador.get("https://beta.coodesh.com/");//abrindo o site
            return navegador;
        }
    }

