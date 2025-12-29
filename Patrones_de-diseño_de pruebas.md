# Patrones de diseño para pruebas

Los patrones de diseño son soluciones a problemas comunes de la programación. Una forma de compartir conocimiento y experiencia entre los desarrolladores y son aplicables a cualquier lenguaje de programación.

## Principios SOLID

- SRP: Cada clase o funcion debe tener una sola responsabilidad.
- OCP: Las clases o funciones deben ser abiertas para extensión, pero cerradas para modificación.
- LSP: las clases derivadas deben poder sustituir a sus clases base sin romper el codigo.
- ISP: Las interfaces deben ser pequeñas e indivisibles.
- DIP: Las clases dependientes deben depender de abstracciones, no de implementaciones concretas. 

# Frameworks de automatizacion

Los framework contienen un conjunto de herramientas, reglas, pautas y mejores practicas que se pueden seguir para cumplir con los objetivos planteados.

## Tipos de framework de automatizacion de pruebas

- Framework de prueba modular: Se crean modulos de scripts de prueba dividiendo la aplicacion completa bajo prueba en pruebas indempendientes mas pequeñas. 
- Framework de secuencia de comandos de linea: Es el mas simple de todos ya que el tester registra maualmente cada paso. (Navegacion yentradas de usuario - insetar puintos de control - pasos de validacion - En la primera iteracion). Despues de que se registran los pasos, se reproduce el script grabado en los pasos siguientes.
- Framework de prueba basado en datos: La logica del caso de prueba se mantiene en los scripts de prueba, mientras que los datos de prueba se mantienen fuera de estos scripts y son leidos de fuentes externas.
- Framework de prueba basado en palabras clave: Esta basada en tablas o palabras de acción, se pueden realizar con o sin la aplicación.
- Framework de prueba hibrido.
- Framework de prueba de desarrollo guiado por el comportamiento: Se crea una plataforma donde se permite a todos los miembros del proceso a participar activamente, no requiere conocimientos en lenguajes de programacion ya que se utiliza el lenguaje natural para construir los casos de prueba.

# Creacion de Test Java y Selenium 

## Localizadores

- id
- className
- name
- linkText
- xpath
- css selector
- tag name
- partial LinkText



