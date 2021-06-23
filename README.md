# JavaProyect
Java - Backend - Springboot - Mysql -CRUD - Postman - Swagger


Se desarrolla proyecto en Java, enfocado unicamente en Backend, se integra SpringBoot + conexion con base de Datos Usando XAMPP + comunicacion con Swagger y Postman

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



