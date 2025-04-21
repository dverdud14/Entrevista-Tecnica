# Entrevista-Tecnica
Automatización del Login

El proyecto fue realizado con las tecnologias de JAVA,Selenium, TesNG. Dicho proyecto estas regido por un Page Object Model, para mantener un orden en el codigo y asi ganrantizar una excelente escalavilidad. Fue desarrollado con el IDE IntelliJ con la ultiva version de JAVA ("22.0.1" ).

Logica del proyecto paso a paso

Paso 1: Crear un Package en Main > java. Dicho package lleva el nombre de "Base" con el archivo "BaseTest" ahi implemente dos metodos, @BeforeMethod en el que inicio el navegador pasando la URL del proyecto y un @AfterMethod en el cual lleva la informacion de cerrar el navegor en cada test.

Paso 2: Crear un Package en Main > java. Dicho package lleva el nombre de "pages" con el archivo "loginPage" aca heredamos de "BaseTest" el navegador y pasamos los selectores de la pagina e implemente la creacion de un constructor con la informacion de cada test el login correcto, Username invalido y Password invalido

Paso 3: Crear un Package en test > java >. Dicho package lleva el nombre de "Test" con el archivo "LoginTest" aca heredamos de los packeges "pages" y "Base". en este ultimo paso desarrole los 3 test con su prioridad y capturando cada mensaje.
