# JavaProyect
Java - Backend - Springboot - Mysql -CRUD - Postman - Swagger


Se desarrolla proyecto en Java, enfocado unicamente en Backend, se integra SpringBoot + conexion con base de Datos Usando XAMPP + comunicacion con Swagger y Postman


# Otros
 //Mostrar nombre de la empresa x id 
 
  SELECT
  p.id, p.nombre_empleado, p.rutificador, p.correo_electronico, pt.nombre_empresa
FROM
  acl p
LEFT JOIN empresa pt
  ON p.id_empresa=pt.id_empresa




