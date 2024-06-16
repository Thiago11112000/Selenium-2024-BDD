package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;
import runner.RunBase;
import support.GeradorEmail;

public class CadastroUsuariosSteps extends RunBase {
    GeradorEmail geradorEmail = new GeradorEmail();
    String email = geradorEmail.gerar();
    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de cadastro de usuario$")
    public void acessaCadastroUsuario() {
        loginPage.acessarAplicacao();
        loginPage.acessarTelaLogin();
        loginPage.acessarCadastroUsuario();
    }
    @E("preencho  as credenciais nome  e-mail gerado e senha {string}")
    public void preenchoAsCredenciaisNomeEMailGeradoESenha(String senha) {
     loginPage.preencherNome();
     loginPage.preencherEmailValidoCadastro(email);
     loginPage.preencherSenha(senha);
    }

    @Quando("clico em cadastrar usuário")
    public void clicoEmCadastrarUsuário() {
    loginPage.clicarbtnCadastroUsuario();
    }

    @Então("vejo mensagem de cadastro com sucesso")
    public void vejoMensagemDeCadastroComSucesso() {

    }


}

