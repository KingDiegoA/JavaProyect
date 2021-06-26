# JavaProyect
Java - Backend - Springboot - Mysql -CRUD - Postman - Swagger


Se desarrolla proyecto en Java, enfocado unicamente en Backend, se integra SpringBoot + conexion con base de Datos Usando XAMPP + comunicacion con Swagger y Postman

##Nuevas Implementaciones
    {
        Se implementaron manejos de errores con JUNIT
        Se implementaron Test mediante TDD
        Se creo un procedimiento de instalacion y ejecucion
    }

##Compilar y Ejecutar el Proyecto
Se debe generar la conexion a la Bd antes de proceder con la ejecucion para evitar errores
Para compilar el proyecto se requiere Java y Maven instalado. Ingresar al directorio JavProject ejecutar el siguiente comando maven

    {
        mvn package
    }

Luego de compilar el proyecto ingresar al directorio target ejecutar el siguiente comando java

    {
        java -jar ./CInventory-0.0.1-SNAPSHOT.jar
    }

##Visualizar Documentación BD y consumir la API

    {
        http://localhost/phpmyadmin/
        http://127.0.0.1:8080/swagger-ui.html#/
    }

# Datos para Agregar
    {
       {
        "rutificador": "14.000.000-0",
        "nombreEmpleado": "Jose Ortiz",
        "nacionalidad": "VZL",
        "correoElectronico": "jortiz@acl.cl",
        "fechaIngreso": "01-06-2021",
        "fechaTermino": "18-06-2021",
        "nombreEmpresa": "ACL"
        }
    }

# Datos para Actualizar
    {
       {
        "rutificador": "14.000.000-0",
        "nombreEmpleado": "Jose Ortiz",
        "nacionalidad": "VZL",
        "correoElectronico": "jortiz@acl.cl",
        "fechaIngreso": "01-06-2021",
        "fechaTermino": "18-06-2021",
        "nombreEmpresa": "Previred"
     }
    }

# Peticion con JSON
    {
     {
        "rutificador": "14.000.000-0",
        "nombreEmpleado": "Roberto Bartolome",
        "nacionalidad": "VZL",
        "correoElectronico": "Rbartolome@acl.cl",
        "fechaIngreso": "01-06-2021",
        "fechaTermino": "18-06-2021",
        "nombreEmpresa": "FALABELLA"
     }
    }

# Datos MYSQL
     {  
        SELECT p.id, 
        p.nombre_empleado, 
        p.rutificador, 
        p.correo_electronico, 
        pt.nombre_empresa 
        FROM members p 
        LEFT JOIN business pt 
        ON p.id_empresa=pt.id_empresa
    }



