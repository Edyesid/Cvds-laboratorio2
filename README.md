# Integrantes
 - Edwin Rodríguez
 - Henry Sánchez

# Cvds-laboratorio 2
## codigo para crear un proyecto maven
'mvn archetype:generate'

## codigo para ejecutar el proyecto de maven

'mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App"'

'mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App" -Dexec.args="'Edwin'"'

'mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.shapes.ShapeMain" -Dexec.args="Hexagon"'
## Preguntas lab

Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:

 **Sin parámetros**

![Sin para](https://i.ibb.co/TLjdMbW/sinPara.jpg)
**Parámetro: qwerty**

![Sin para](https://i.ibb.co/MC101FJ/QWERTY.jpg)

 Parámetro: pentagon

![Sin para](https://i.ibb.co/kQ95bb3/Pentagon.jpg)

**Parámetro Hexagon**

![Sin para](https://i.ibb.co/5rrhcXR/Captura.jpg)

¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

Solo se ejecuta correctamente la instrucción que recibe como parametro Hexagon, porque es el unico que esta correcto.
