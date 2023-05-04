# MicroProfile Aplicaciones Generadas

En este reto crearemos un microservicio asistidos por la herramienta *MicroProfile Starter*.
 
<ol type="1">
    <li>Primero accedemos al sitio de Microprofile y seleccionamos la configuración deseada para nuestro proyecto.</li>
    <li>Una vez descomprimido, usaremos un IDE y maven para compilar el proyecto <h4>mvn clean package</h4></li>
    <li>Una vez compilado, abrimos una terminal, nos colocamos en el directorio del proyecto y ejecutamos el siguiente comando:
    <h4>java -jar target/demo.jar</h4></li>
</ol>

Microprofile genera 2 aplicaciones automáticamente, de modo que los ejemplos REST sean más realistas
pues llaman a un endpoint desde otro servicio.

<ul>
    <li>En "service-a" se hace referencia a la parte del "cliente" de la estructura.
    <li>En "service-b" están algunos endpoints que son llamadas por el código del "cliente".
</ul>

En los `readme.md` de cada servicio se especifica cómo construirlos y correrlos.

Después de construir ambos proyectos e iniciarlos, la página local de ejecución será:

    http://localhost:9080/index.html
