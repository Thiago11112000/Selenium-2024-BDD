package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;
import runner.RunBase;
import support.GeradorEmail;

public class LoginSteps extends RunBase {
    GeradorEmail geradorEmail = new GeradorEmail();
    String email = geradorEmail.gerar();
    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void acessaTeladeLogin() {
        loginPage.acessarAplicacao();
        loginPage.acessarTelaLogin();
        System.out.println("Acessou Tela de Login");
    }

    @Dado("preencho o e-mail gerado e senha {string}")
    public void preencho_o_e_mail_gerado_e_senha(String senha) {
        loginPage.preencherEmailValido(email);
        loginPage.preencherSenha(senha);
    }

    @Dado("preencho o e-mail {string} e senha {string}")
    public void preencho_email_e_senha_inválidos(String email, String senha) {
        loginPage.preencherEmailInvalido(email);
        loginPage.preencherSenha(senha);
        System.out.println(email);
    }

    @Quando("^clico no botão de login$")
    public void clicaBotaoLogin() {
        loginPage.clicarBotao();
        System.out.println("Clico botão de login");
    }

    @Então("^sou logado com sucesso$")
    public void verificaLogin() {
        loginPage.checkLoginSucesso();
    }

    @Então("vejo mensagem {string}")
    public void vejo_mensagem(String mensagem) {
        loginPage.checkErrorLogin(mensagem);
    }
    }


