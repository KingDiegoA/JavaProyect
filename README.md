# JavaProyect
Java - Backend - Springboot - Mysql -CRUD - Postman - Swagger

# Nuevas Implementaciones
    {
        Se implementaron manejos de errores con JUNIT
        Se implementaron Test mediante TDD
        Se creo un procedimiento de instalacion y ejecucion
    }
    
### Pasos para Ejecutar
_Paso N°1_
    {
        Se debe instalar Xampp, iniciar acciones de Apache y MySQL, Puerto por defecto 3306
    }
   * [Xampp](https://www.apachefriends.org/es/index.html) - Gestor de Base de Datos
   
_Paso N°2_
    {
        Se debe iniciar el projecto mediante IntelliJ IDEA
    }
     * [IntelliJ](https://www.jetbrains.com/es-es/idea/download/) - Entorno de Desarrollo

### Compilar y Ejecutar el Proyecto
_Se debe generar la conexion a la Bd antes de proceder con la ejecucion para evitar errores_
_Para compilar el proyecto se requiere Java y Maven instalado. Ingresar al directorio JavProject ejecutar el siguiente comando maven_

    {
        mvn package
    }


Luego de compilar el proyecto ingresar al directorio target ejecutar el siguiente comando java

    {
        java -jar ./CInventory-0.0.1-SNAPSHOT.jar
    }

### Visualizar Documentación BD y consumir la API

    {
        http://localhost/phpmyadmin/
        http://127.0.0.1:8080/swagger-ui.html#/
    }




