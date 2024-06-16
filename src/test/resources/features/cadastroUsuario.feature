# language: pt
@cadastro-usuario
Funcionalidade: Cadastro de usuários
  Eu como usuário do sistema
  Quero me cadastrar
  Para fazer uma compra


  @cadastro-usuario-sucesso
  Cenário: Cadastro de usuário com sucesso
    Dado que estou na tela de cadastro de usuario
    E preencho  as credenciais nome  e-mail gerado e senha "1234567"
    Quando  clico em cadastrar usuário
    Então vejo mensagem de cadastro com sucesso




