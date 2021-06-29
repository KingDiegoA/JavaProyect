# JavaProyect
Java - Backend - Springboot - Mysql -CRUD - Postman - Swagger


Se desarrolla proyecto en Java, enfocado unicamente en Backend, se integra SpringBoot + conexion con base de Datos Usando XAMPP + comunicacion con Swagger y Postman

# Nuevas Implementaciones
    {
        Se implementaron manejos de errores con JUNIT
        Se implementaron Test mediante TDD
        Se creo un procedimiento de instalacion y ejecucion
    }

# Compilar y Ejecutar el Proyecto
Se debe generar la conexion a la Bd antes de proceder con la ejecucion para evitar errores
Para compilar el proyecto se requiere Java y Maven instalado. Ingresar al directorio JavProject ejecutar el siguiente comando maven

    {
        mvn package
    }

Luego de compilar el proyecto ingresar al directorio target ejecutar el siguiente comando java

    {
        java -jar ./CInventory-0.0.1-SNAPSHOT.jar
    }

# Visualizar Documentación BD y consumir la API

    {
        http://localhost/phpmyadmin/
        http://127.0.0.1:8080/swagger-ui.html#/
    }




