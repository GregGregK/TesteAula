package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Componentes {
    private WebDriver driver;
    private Select combo;

    public void inicializar(){
        String chromeDriver = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage() .window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/drivers/componentes.html");
    }

    public void testeAlertNome() { driver.findElement(By.id("elementosForm:cadastrar")).click(); }

    public void validaAlertNome() {
        Alert alert = driver.switchTo().alert();
        String alertaNome = alert.getText();

        Assert.assertEquals("Nome eh obrigatorio", alertaNome);

        alert.accept();
    }

    public void testeAlertSobrenome() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("asd");
        driver.findElement(By.id("elementosForm:cadastrar")).click(); }

    public void validaAlertSobrenome() {
        Alert alert = driver.switchTo().alert();
        String alertaSobrenome = alert.getText();

        Assert.assertEquals("Sobrenome eh obrigatorio", alertaSobrenome);

        alert.accept();
    }

    public void testeAlertSexo() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("asd");
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("asd");
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    public void validaAlertSexo() {
        Alert alert = driver.switchTo().alert();
        String alertaSexo = alert.getText();

        Assert.assertEquals("Sexo eh obrigatorio", alertaSexo);

        alert.accept();
    }

    public void testeFormulario() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Natan");
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Bays");
        driver.findElement(By.id("elementosForm:sexo:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
        Select Escolaridade = new Select(driver.findElement(By.id("elementosForm:escolaridade")));
        Escolaridade.selectByValue("superior");
        WebElement esporte = driver.findElement(By.id("elementosForm:esportes"));
        combo = new Select(esporte);
        combo.selectByVisibleText("O que eh esporte?");
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Nada");
    }

    public void cadastroFormulario() {
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    public void validaFormulario() {
        Assert.assertEquals("Nome: Natan", driver.findElement(By.id("descNome")).getText());
        Assert.assertEquals("Sobrenome: Bays", driver.findElement(By.id("descSobrenome")).getText());
        Assert.assertEquals("Sexo: Masculino", driver.findElement(By.id("descSexo")).getText());
        Assert.assertEquals("Comida: Frango", driver.findElement(By.id("descComida")).getText());
        Assert.assertEquals("Escolaridade: superior", driver.findElement(By.id("descEscolaridade")).getText());
        Assert.assertEquals("Esportes: O que eh esporte?", driver.findElement(By.id("descEsportes")).getText());
        Assert.assertEquals("Sugestoes: Nada", driver.findElement(By.id("descSugestoes")).getText());
    }

    public void testeAlert() {
        driver.findElement(By.id("alert")).click();
    }

    public void validaAlert() {
        Alert alert = driver.switchTo().alert();
        String alerta = alert.getText();

        Assert.assertEquals("Alert Simples", alerta);

        alert.accept();
    }

    public void testeConfirm() {
        driver.findElement(By.id("confirm")).click();
    }

    public void validaConfirm() {
        Alert alert = driver.switchTo().alert();
        String confirm = alert.getText();

        Assert.assertEquals("Confirm Simples", confirm);

        alert.accept();

        String confirm2 = alert.getText();

        Assert.assertEquals("Confirmado", confirm2);

        alert.accept();
    }

    public void testeConfirmNegado() {
        driver.findElement(By.id("confirm")).click();
    }

    public void validaConfirmNegado() {
        Alert alert = driver.switchTo().alert();
        String confirmNegado = alert.getText();

        Assert.assertEquals("Confirm Simples", confirmNegado);

        alert.dismiss();

        String confirmNegado2 = alert.getText();

        Assert.assertEquals("Negado", confirmNegado2);

        alert.accept();
    }

    public void testePrompt() {
        driver.findElement(By.id("prompt")).click();
    }

    public void validaPrompt() {
        Alert alert = driver.switchTo().alert();

        alert.sendKeys("9");
        alert.accept();

        String prompt = alert.getText();
        Assert.assertEquals("Era 9?", prompt);
        alert.accept();

        String prompt2 = alert.getText();
        Assert.assertEquals(":D", prompt2);
        alert.accept();
    }



    public void testeTextField(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Batatinha");
    }

    public void validaTextField(){
        Assert.assertEquals("Batatinha", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void fechaNavegador(){
        driver.quit();
    }

    public void testeTextArea(){
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Batatinha\nBatatinha");
    }

    public void validaTextArea(){
        Assert.assertEquals("Batatinha\nBatatinha", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }

    public void testeSexo(){
        driver.findElement(By.id("elementosForm:sexo:0")).click();
    }

    public void validaSexo(){
        Assert.assertEquals(true, driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
    }

    public void testeComida(){
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
    }

    public void validaComida(){
        Assert.assertEquals(true, driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
    }

    public void testeEscolaridade(){
        Select Escolaridade = new Select(driver.findElement(By.id("elementosForm:escolaridade")));
        Escolaridade.selectByValue("superior");
    }

    public void validaEscolaridade(){
        Select validaEscolaridade = new Select(driver.findElement(By.id("elementosForm:escolaridade")));
        String valorSelecionado = validaEscolaridade.getFirstSelectedOption().getAttribute("value");
        Assert.assertEquals("superior", valorSelecionado);
    }

}
