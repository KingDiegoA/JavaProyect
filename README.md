# JavaProyect
Java - Backend - Springboot - Mysql -CRUD - Postman - Swagger

# Nuevas Implementaciones
    {
        Se implementaron manejos de errores con JUNIT
        Se implementaron Test mediante TDD
        Se creo un procedimiento de instalacion y ejecucion
    }
    
# Pasos para Ejecutar
    {
        Se debe instalar Xampp, iniciar acciones de Apache y MySQL, Puerto por defecto 3306
   * [IntelliJ](https://www.jetbrains.com/es-es/idea/) - Entorno de desarrollo
    }

# Compilar y Ejecutar el Proyecto
_Se debe generar la conexion a la Bd antes de proceder con la ejecucion para evitar errores_
Para compilar el proyecto se requiere Java y Maven instalado. Ingresar al directorio JavProject ejecutar el siguiente comando maven

    {
        mvn package
        * [IntelliJ](https://www.jetbrains.com/es-es/idea/) - Entorno de desarrollo
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




