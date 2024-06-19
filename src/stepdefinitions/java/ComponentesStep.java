package stepdefinitions.java;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import util.Componentes;
public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário accesou o arquivo Campo de treinamento")
    public void que_o_usuário_accesou_o_arquivo_Campo_de_treinamento() {
        componentes.inicializar();
    }

    @Quando("o usuário não digita o nome")
    public void o_usuário_não_digita_o_nome() {
        componentes.testeAlertNome();
    }

    @Entao("o resultado deve ser um alert na tela dizendo que o nome é obrigatorio")
    public void o_resultado_deve_ser_um_alert_na_tela_dizendo_que_o_nome_é_obrigatorio() {
        componentes.validaAlertNome();
        componentes.fechaNavegador();
    }

    @Quando("o usuário digitar o nome mas não o sobrenome")
    public void o_usuário_digitar_o_nome_mas_não_o_sobrenome() {
        componentes.testeAlertSobrenome();
    }

    @Entao("o resultado deve ser um alert na tela dizendo que o sobrenome é obrigatorio")
    public void o_resultado_deve_ser_um_alert_na_tela_dizendo_que_o_sobrenome_é_obrigatorio() {
        componentes.validaAlertSobrenome();
        componentes.fechaNavegador();
    }

    @Quando("o usuário digitar o nome e sobrenome mas não colocar o sexo")
    public void o_usuário_digitar_o_nome_e_sobrenome_mas_não_colocar_o_sexo() {
        componentes.testeAlertSexo();
    }

    @Entao("o resultado deve ser um alert na tela dizendo que o sexo é obrigatorio")
    public void o_resultado_deve_ser_um_alert_na_tela_dizendo_que_o_sexo_é_obrigatorio() {
        componentes.validaAlertSexo();
        componentes.fechaNavegador();
    }

    @Dado("Que o usuário preencheu os campos de Nome, Sobrenome, Sexo, ComedaPref, Escolaridade, Esporte e Sugestao")
    public void que_o_usuário_preencheu_os_campos_de_Nome_Sobrenome_Sexo_ComedaPref_Escolaridade_Esporte_e_Sugestao() {
        componentes.testeFormulario();
    }

    @Quando("Clicar no botão cadastrar")
    public void clicar_no_botão_cadastrar() {
        componentes.cadastroFormulario();
    }

    @Entao("As informações devem ser cadastradas e mostradas abaixo do formulário")
    public void as_informações_devem_ser_cadastradas_e_mostradas_abaixo_do_formulário() {
        componentes.validaFormulario();
        componentes.fechaNavegador();
    }

    @Quando("Clicar no botão de Alert")
    public void clicar_no_botão_de_Alert() {
        componentes.testeAlert();
    }

    @Entao("Um alerta deve aparecer na tela dizendo o texto Alert Simples")
    public void um_alerta_deve_aparecer_na_tela_dizendo_o_texto_Alert_Simples() {
        componentes.validaAlert();
        componentes.fechaNavegador();
    }

    @Quando("Clicar no botão de Confirm")
    public void clicar_no_botão_de_Confirm() {
        componentes.testeConfirm();
    }

    @Entao("Um alerta deve aparecer na tela dizendo o texto Confirm Simples")
    public void um_alerta_deve_aparecer_na_tela_dizendo_o_texto_Confirm_Simples() {
        componentes.validaConfirm();
        componentes.fechaNavegador();
    }

    @Quando("Clicar no botão de Confirm e Negar ele")
    public void clicar_no_botão_de_Confirm_e_Negar_ele() {
        componentes.testeConfirmNegado();
    }

    @Entao("Um alerta deve aparecer na tela dizendo o texto Negado")
    public void um_alerta_deve_aparecer_na_tela_dizendo_o_texto_Negado() {
        componentes.validaConfirmNegado();
        componentes.fechaNavegador();
    }

    @Quando("Clicar no botão de Prompt")
    public void clicar_no_botão_de_Prompt() {
        componentes.testePrompt();
    }

    @Entao("Um alerta deve aparecer na tela com um textlabel para digitar o numero")
    public void um_alerta_deve_aparecer_na_tela_com_um_textlabel_para_digitar_o_numero() {
        componentes.validaPrompt();
        componentes.fechaNavegador();
    }

}
