package Acessos;

import Pages.*;
import Suporte.Web;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class saucedemo {
    private WebDriver navegador;

    @Before
    public void AbrirNav() {
        navegador = Web.creatChrome();

    }

    @Test
    public void testAcessosite() throws InterruptedException {

        new HomePage(navegador)
                .validapagina()
                .Clicalogin();
        new Cadastrasepage(navegador)
                .cadastrase();
       new Cadastro(navegador)
               .Inserenome()
               .Inseriremail()
               .Inserirsenha()
               .Aceitatermos(Keys.SPACE)
               .Inscrever();
       new Perfil(navegador)
               .Selecionacarreira()
               .Areatec()
               .MomentoProf()
               .NumContato()
               .InseriCidade()
               .ReceberOfertas()
               .Entraremproximo();
        new Pessoal(navegador)
                .SelecionarRaca()
                .orietsexual()
                .SelecionaGenero()
                .SelecionaDeficiencia()
                .Clicarproximo();
        new Scorecard(navegador)
                .ResponderAgora();
        new ResponderScorecard(navegador)
                .MetodologiasÁgeisScrum()
                .Modelagemdedados()
                .EstruturadeDados()
                .UML()
                .Git()
                .ComunicacaoTecnica()
                .GestTempo()
                .Logica()
                .Exploratorios()
                .CasodeUso()
                .BotaoContinuar();
        new Scorecard2(navegador)
                .Behaviour()
                .TestDriven()
                .UnitTests()
                .TestCoverage()
                .AutomaçãodeTestes()
                .PlanejamentodeTestes()
                .ARequisitos()
                .botaocontinuar();
        new Curriculum(navegador)
                .BotaoAdicionar()
                .Behaviour()
                .InserirCPF()
                .InserirObjetivos()
                .Clicarsalvar()
                .Botaoadicionar()
                .InserirdadosExperiencia()
                .Adformacao()
                .Adinformacoes()
                .IrDashboard();
        new Dashboard(navegador)
                .BotaoVagas();
        new Vagas(navegador)
                .BotaoVagas();

    }

}