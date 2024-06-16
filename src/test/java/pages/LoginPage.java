package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunTests;
import support.GeradorEmail;
import support.SupportEnv;

public class LoginPage  extends RunTests {
    // elementos
    private String URL = "";
    private By botaoAcessarLogin = By.className("fa-user");
    private By campoEmail = By.id("user");
    private By botaoCriarConta = By.id("createAccount");


    GeradorEmail geradorEmail = new  GeradorEmail();

    // ações / funções / metodos
    public void acessarAplicacao(){
        initDriver(System.getProperty("browser"));
        getDriver().get(SupportEnv.getEnv());
    }

    public void acessarTelaLogin() {
        driver.findElement(By.className("fa-user")).click();
    }

    public void preencherEmailValido(  String email){
        getDriver().findElement(By.id("user")).sendKeys(geradorEmail.gerar());
        System.out.println(email);
    }
public void preencherEmailInvalido(  String email){
        getDriver().findElement(By.id("user")).sendKeys(email);
        System.out.println("Email: " + email);

}
    public void preencherSenha( String senha){
        getDriver().findElement(By.id("password")).sendKeys(senha);
        System.out.println("Senha: " + senha);
    }
    public void clicarBotao( ){
        getDriver().findElement(By.id("btnLogin")).click();
    }
    public void checkLoginSucesso( ){
        System.out.println("Logado com sucesso");
        String textoEsperado = "Login realizado";
        String textoTela = getDriver().findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("Os textos não são iguais",textoEsperado, textoTela);
        System.out.println(textoTela);
    }
    public void checkErrorLogin(  String mensagem ){

        String textoTela = getDriver().findElement(By.className("invalid_input")).getText();
        Assert.assertEquals("Os textos não são iguais",mensagem, textoTela);
        System.out.println("Mensagem para validar " + mensagem);
    }
    public void acessarCadastroUsuario(){
        getDriver().findElement(By.id("createAccount")).click();
    }
    public void preencherNome(){
        getDriver().findElement(By.id("user")).sendKeys("Thiago");

    }
    public void preencherEmailValidoCadastro(  String email){
        getDriver().findElement(By.id("email")).sendKeys(geradorEmail.gerar());
        System.out.println(email);
    }
    public void clicarbtnCadastroUsuario(){
        getDriver().findElement(By.id("btnRegister")).click();
    }
    public void checkCadastraoSucesso(){
        String textoEsperado = "Cadastro realizado!";
        String textoTela = getDriver().findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("Os textos não são iguais",textoEsperado, textoTela);
    }



}
