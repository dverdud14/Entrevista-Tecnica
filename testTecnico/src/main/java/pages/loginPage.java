package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    private WebDriver driver;

    private By txtUsuario = (By.id("username"));
    private By txtClave = (By.id("password"));
    private By btnIngresar = (By.id("submit"));
    private By loginCorrecto = (By.xpath("//h1[contains(text(), 'Logged In Successfully')]"));
    private By userFail = (By.id("error"));
    private By passFail = (By.xpath("//div[@id='error']"));

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarSesion() {
        driver.findElement(txtUsuario).sendKeys("student");
        driver.findElement(txtClave).sendKeys("Password123");
        driver.findElement(btnIngresar).click();
    }

    public void usuarioIncorrecto() {
        driver.findElement(txtUsuario).sendKeys("incorrectUser");
        driver.findElement(txtClave).sendKeys("Password123");
        driver.findElement(btnIngresar).click();
    }

    public void contrasenaIncorrecta() {
        driver.findElement(txtUsuario).sendKeys("student");
        driver.findElement(txtClave).sendKeys("incorrectPassword ");
        driver.findElement(btnIngresar).click();

    }

    public String loginExitoso() {
        return driver.findElement(loginCorrecto).getText();
    }

    public String UsuarioFailed() {
        return driver.findElement(userFail).getText();
    }

    public String contrasenaFailed() {
        return driver.findElement(passFail).getText();
    }

}
