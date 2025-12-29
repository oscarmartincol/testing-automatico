# Suite de smoke
# Suite de regresión
# Funcionalidad
# Nivel

Las suites son configuradas con Junit haciendo uso de la anotación @Tag("nombre descriptivo").
Un test puede pertenecer a varias suites.

Para ejecutar una suit, se configura en el IDE la ejecución para cada tag implementado en las pruebas.


# Reportes de pruebas

Extend reports, es utilizado por su facilidad de configuracion con Selenium Webdriver.
Se crea clase ExtentFactory

repositorio de ejemplo de reporte con extendreports https://github.com/digitalhouse-content/selenium_webdriver/tree/S10_casos_negativos

# Validaciones de automatización

- La libreria de Assertion de Junit permite hacer las validaciones de automatización.

# Automatizacion de pruebas a servicios REST CON REST Assured

- Para pruebas manueles se suele utilizar Postman para verificar el acceso a las direcciones de una API.
- Para hacer las pruebas sepuede utilizar la pagina www.reqres.in.
- Para pruebas automatizadas es necesario instalar las dependencias de Maven:
 
 - Rest Assured
 - TestNG
 - Maven Surfire Plugin

Ejemplo: https://github.com/digitalhouse-content/restAssured/tree/S11_Config_RestAssured

# Buenas practicas en automatización de pruebas de RestAssured

- Crear variables que tengan en común distintos test con una variable global.
- Complementar el path de cada prueba con una variabke local en cada metodo.

Ejemplo: https://github.com/digitalhouse-content/restAssured/tree/S12_Validaciones_RestAssured

# Framework Karate

