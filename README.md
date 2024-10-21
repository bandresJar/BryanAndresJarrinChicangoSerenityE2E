# Proyecto de Pruebas de Flujo de Compra en SauceDemo

Este proyecto consiste en la automatización de pruebas para el flujo de compra en la plataforma SauceDemo utilizando Serenity y Cucumber. A continuación se presentan las instrucciones para la ejecución de las pruebas.

## Requisitos Previos

Antes de ejecutar las pruebas, asegúrate de tener instalados los siguientes programas:

- [Java JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Gradle](https://gradle.org/install/) Usado en el proyecto
- [Maven](https://maven.apache.org/download.cgi) (opcional, dependiendo de tu configuración)
- Navegador web (Chrome, Firefox, etc.) - Firefox fue usado en el proyecto y se puede cambiar en el archivo de Serenity.conf
- [WebDriver](https://www.selenium.dev/documentation/webdriver/getting_started/installation/) correspondiente al navegador que usarás.

## Instrucciones de Ejecución

1. **Clona el Repositorio**:
   Abre una terminal y clona el repositorio usando el siguiente comando:
 
   git clone https://github.com/bandresJar/SerenityE2E
2. **Navega a la Carpeta del Proyecto:

    cd SerenityE2E
3. ** Configura el WebDriver: Asegúrate de tener el WebDriver correspondiente a tu navegador en la carpeta del proyecto o en el PATH de tu sistema.

4. **Ejecuta las Pruebas: Utiliza Gradle para ejecutar las pruebas. En la terminal, ejecuta:

./gradlew test

5. ** Verifica los Resultados: Los resultados de las pruebas se generarán en el directorio build/reports/tests/test/index.html. Abre este archivo en tu navegador para ver los detalles de las pruebas.

## Estructura del Proyecto
1. **src/main/java: Contiene el código fuente del proyecto.
2. **src/test/java: Contiene las pruebas automatizadas y las definiciones de los pasos.
3. **src/test/resources: Contiene los archivos de características (feature files) y recursos necesarios para las pruebas.
