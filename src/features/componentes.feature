#language: pt
  Funcionalidade: Acessar vários componentes html

      Contexto:
        Dado que o usuário accesou o arquivo Campo de treinamento

      Cenario: Validar campo Nome
        Quando o usuário não digita o nome
        Entao o resultado deve ser um alert na tela dizendo que o nome é obrigatorio

      Cenario: Validar campo Sobrenome
        Quando o usuário digitar o nome mas não o sobrenome
        Entao o resultado deve ser um alert na tela dizendo que o sobrenome é obrigatorio

      Cenario: Validar campo Sexo
        Quando o usuário digitar o nome e sobrenome mas não colocar o sexo
        Entao o resultado deve ser um alert na tela dizendo que o sexo é obrigatorio

      Cenario: Validar campos de Nome, Sobrenome, Sexo, ComidaPref, Escolaridade, Esporte e Sugestao
        Dado Que o usuário preencheu os campos de Nome, Sobrenome, Sexo, ComedaPref, Escolaridade, Esporte e Sugestao
        Quando Clicar no botão cadastrar
        Entao As informações devem ser cadastradas e mostradas abaixo do formulário

      Cenario: Validar Alert
        Quando Clicar no botão de Alert
        Entao Um alerta deve aparecer na tela dizendo o texto Alert Simples

      Cenario: Validar Confirm
        Quando Clicar no botão de Confirm
        Entao Um alerta deve aparecer na tela dizendo o texto Confirm Simples

      Cenario: Validar ConfirmNegado
        Quando Clicar no botão de Confirm e Negar ele
        Entao Um alerta deve aparecer na tela dizendo o texto Negado

      Cenario: Validar Prompt
        Quando Clicar no botão de Prompt
        Entao Um alerta deve aparecer na tela com um textlabel para digitar o numero

