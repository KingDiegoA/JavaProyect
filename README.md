# JavaProyect
Java - Backend - Springboot - Mysql -CRUD - Postman - Swagger


Se desarrolla proyecto en Java, enfocado unicamente en Backend, se integra SpringBoot + conexion con base de Datos Usando XAMPP + comunicacion con Swagger y Postman

# Datos para Agregar
    {   
        
        {
        "rutificador": "14.000.000-0",
        "nombreEmpleado": "Roberto Bartolome",
        "nacionalidad": "VZL",
        "correoElectronico": "Rbartolome@acl.cl",
        "fechaIngreso": "14-06-2021",
        "fechaTermino": "30-08-2021",
        "idEmpresa": 2020
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



