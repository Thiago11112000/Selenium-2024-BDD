# language: pt
  @login
  Funcionalidade: Login
    Eu como usuário do sistema
    Quero fazer login
    Para fazer uma compra

    Contexto:  Acessar aplicação
      Dado que estou na tela de login

    @login-sucesso
    Cenario: Login com sucesso
     E preencho o e-mail gerado e senha "1234567"
     Quando  clico no botão de login
     Então  sou logado com sucesso


      @login-falha
      Esquema do Cenario: Credenciais inválidas
        E preencho o e-mail "<email>" e senha "<senha>"
        Quando  clico no botão de login
        Então  vejo mensagem "<mensagem>"

        Exemplos:
        | email             |senha           |mensagem         |
        | xxxxxxxx          |12344567        |E-mail inválido. |
        |                   |12344567        |E-mail inválido. |
        | finnoti@gmail.com |.....           |Senha inválida.  |
        | finnoti@gmail.com |                |Senha inválida.  |
