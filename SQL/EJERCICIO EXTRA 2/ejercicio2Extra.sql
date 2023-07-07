#1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
SELECT CODIGO_OFICINA, CIUDAD FROM OFICINA;
#2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
SELECT CIUDAD, TELEFONO FROM OFICINA WHERE PAIS='ESPAÑA';
#3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un
#código de jefe igual a 7.
SELECT NOMBRE,APELLIDO1,APELLIDO2, EMAIL 
FROM EMPLEADO
WHERE CODIGO_JEFE = 7;
#4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
SELECT NOMBRE ,APELLIDO1, APELLIDO2,PUESTO AS 'CARGO',EMAIL
FROM EMPLEADO
WHERE PUESTO = 'DIRECTOR GENERAL' ;
#5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean
#representantes de ventas.
SELECT NOMBRE, APELLIDO1,APELLIDO2, PUESTO
FROM EMPLEADO
WHERE PUESTO <> 'REPRESENTANTE VENTAS';
#6. Devuelve un listado con el nombre de los todos los clientes españoles.
SELECT NOMBRE_CLIENTE, PAIS FROM CLIENTE WHERE PAIS = 'SPAIN';	
#7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
SELECT ESTADO FROM PEDIDO GROUP BY ESTADO;
#8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago
#en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
#repetidos. Resuelva la consulta:
#o Utilizando la función YEAR de MySQL.
SELECT DISTINCT CODIGO_CLIENTE
FROM PAGO
WHERE YEAR(FECHA_PAGO) = 2008;
#o Utilizando la función DATE_FORMAT de MySQL.
SELECT DISTINCT CODIGO_CLIENTE
FROM PAGO
WHERE DATE_FORMAT(FECHA_PAGO,'%Y') = 2008;
#o Sin utilizar ninguna de las funciones anteriores.
SELECT DISTINCT CODIGO_CLIENTE
FROM PAGO
WHERE FECHA_PAGO BETWEEN '2008-01-01' AND '2008-12-31';