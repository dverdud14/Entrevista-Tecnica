package Tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.loginPage;

public class LoginTest extends BaseTest {


    @Test(description = "Test inicia con las credenciales correctas", priority = 1)
    public void loginCorrectoTest() {
        loginPage loginPage = new loginPage(driver);

        loginPage.iniciarSesion();
        String actualMessage = loginPage.loginExitoso();
        System.out.println("Test de inicio de sesión correcto - Mensaje obtenido: " + actualMessage);
        Assert.assertEquals("Logged In Successfully", actualMessage);
    }

    @Test(description = "Test inicia con un usuario incorrecto", priority = 2)
    public void loginUsuarioIncorrectoTest() {
        loginPage loginPage = new loginPage(driver);

        loginPage.usuarioIncorrecto();
        String actualMessage = loginPage.UsuarioFailed();
        System.out.println("Test de usuario incorrecto - Mensaje obtenido: " + actualMessage);
        Assert.assertEquals("Your username is invalid!", actualMessage);
    }

    @Test(description = "Test inicia con una contraseña incorrecta", priority = 3)
    public void loginPassIncorrectoTest() {
        loginPage loginPage = new loginPage(driver);

        loginPage.contrasenaIncorrecta();
        String actualMessage = loginPage.contrasenaFailed();
        System.out.println("Test de contraseña incorrecta - Mensaje obtenido: " + actualMessage);
        Assert.assertEquals("Your password is invalid!", actualMessage);
    }


}
