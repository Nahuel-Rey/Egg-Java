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
#9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
#entrega de los pedidos que no han sido entregados a tiempo.
SELECT CODIGO_CLIENTE,CODIGO_PEDIDO,FECHA_ESPERADA, FECHA_ENTREGA
FROM PEDIDO
WHERE FECHA_ENTREGA > FECHA_ESPERADA;
#10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
#entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
#esperada.
#o Utilizando la función ADDDATE de MySQL.
SELECT CODIGO_CLIENTE,CODIGO_PEDIDO,FECHA_ESPERADA, FECHA_ENTREGA
FROM PEDIDO
WHERE FECHA_ENTREGA <= ADDDATE(FECHA_ESPERADA,INTERVAL -2 DAY) ;
#o Utilizando la función DATEDIFF de MySQL
SELECT CODIGO_CLIENTE,CODIGO_PEDIDO,FECHA_ESPERADA, FECHA_ENTREGA
FROM PEDIDO
WHERE DATEDIFF(FECHA_ESPERADA,FECHA_ENTREGA) >=2;
#11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
SELECT *
FROM PEDIDO
WHERE ESTADO = 'RECHAZADO' AND YEAR(FECHA_ESPERADA) = 2009;
#12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de
#cualquier año.
SELECT *
FROM PEDIDO
WHERE ESTADO = 'ENTREGADO' AND DATE_FORMAT(FECHA_ENTREGA,'%m') = 01;
#13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
#Ordene el resultado de mayor a menor.
SELECT *
FROM PAGO
WHERE FORMA_PAGO ='PAYPAL'AND DATE_FORMAT(FECHA_PAGO,'%Y') = 2008
ORDER BY TOTAL;
#14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en
#cuenta que no deben aparecer formas de pago repetidas.
SELECT DISTINCT FORMA_PAGO FROM PAGO;
#15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que
#tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
#venta, mostrando en primer lugar los de mayor precio.
SELECT *
FROM PRODUCTO
WHERE GAMA = 'ORNAMENTALES' AND CANTIDAD_EN_STOCK > 100
ORDER BY PRECIO_VENTA DESC;
#16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo
#representante de ventas tenga el código de empleado 11 o 30.
SELECT *
FROM CLIENTE
WHERE CIUDAD = 'MADRID' AND CODIGO_EMPLEADO_REP_VENTAS IN (11,30);
/*Consultas multitabla (Composición interna)

Las consultas se deben resolver con INNER JOIN.
(CREO QUE NO ES LO QUE QUERIA LA CONSIGNA, YA QUE ACLARA QUE ES COMPOSICION INTERNA, POR LO CUAL NO DEBERIA TENER MUCHOS INNER JOIN SEGUIDOS; Y SI MAS SUBCONSULTAS QUE INTERRELACIONEN LA TABLA....PERO ME DI CUENTA TARDE(? )

1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante
de ventas.*/
SELECT C.NOMBRE_CLIENTE, E.NOMBRE AS REPRESENTANTE_DE_VENTAS, E.APELLIDO1, E.APELLIDO2
FROM CLIENTE C
INNER JOIN EMPLEADO E ON C.CODIGO_EMPLEADO_REP_VENTAS=E.CODIGO_EMPLEADO;
#2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus
#representantes de ventas.
SELECT C.NOMBRE_CLIENTE AS NOMBRE_CLIENTE,E.NOMBRE AS REPRESENTANTE_DE_VENTAS,P.FECHA_PAGO
FROM CLIENTE C 
INNER JOIN EMPLEADO E ON C.CODIGO_EMPLEADO_REP_VENTAS=E.CODIGO_EMPLEADO
JOIN PAGO P ON P.CODIGO_CLIENTE=C.CODIGO_CLIENTE;
#3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de
#sus representantes de ventas.
SELECT C.NOMBRE_CLIENTE AS NOMBRE_CLIENTE,E.NOMBRE AS REPRESENTANTE_DE_VENTAS
FROM CLIENTE C 
INNER JOIN EMPLEADO E ON C.CODIGO_EMPLEADO_REP_VENTAS=E.CODIGO_EMPLEADO
WHERE C.CODIGO_CLIENTE NOT IN(SELECT P.CODIGO_CLIENTE
							  FROM PAGO P);
#4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes
#junto con la ciudad de la oficina a la que pertenece el representante.
SELECT C.NOMBRE_CLIENTE AS NOMBRE_CLIENTE,E.NOMBRE AS REPRESENTANTE_DE_VENTAS,P.FECHA_PAGO,O.CIUDAD AS CIUDAD_OFICINA
FROM CLIENTE C 
INNER JOIN EMPLEADO E ON C.CODIGO_EMPLEADO_REP_VENTAS=E.CODIGO_EMPLEADO
JOIN PAGO P ON P.CODIGO_CLIENTE=C.CODIGO_CLIENTE
JOIN OFICINA O ON O.CODIGO_OFICINA=E.CODIGO_OFICINA;
#5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
#representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT DISTINCT C.NOMBRE_CLIENTE AS NOMBRE_CLIENTE,E.NOMBRE AS REPRESENTANTE_DE_VENTAS,O.CIUDAD AS CIUDAD_OFICINA
FROM CLIENTE C 
INNER JOIN EMPLEADO E ON C.CODIGO_EMPLEADO_REP_VENTAS=E.CODIGO_EMPLEADO
JOIN OFICINA O ON O.CODIGO_OFICINA=E.CODIGO_OFICINA
WHERE C.CODIGO_CLIENTE NOT IN(SELECT P.CODIGO_CLIENTE
							  FROM PAGO P);
#6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT O.LINEA_DIRECCION1,O.LINEA_DIRECCION2,C.NOMBRE_CLIENTE AS NOMBRE_CLIENTE, C.CIUDAD
FROM CLIENTE C 
INNER JOIN EMPLEADO E ON C.CODIGO_EMPLEADO_REP_VENTAS=E.CODIGO_EMPLEADO
JOIN OFICINA O ON O.CODIGO_OFICINA=E.CODIGO_OFICINA
WHERE C.CIUDAD = 'FUENLABRADA';
#7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad
#de la oficina a la que pertenece el representante.
SELECT C.NOMBRE_CLIENTE, E.NOMBRE AS 'REPRESENTANTE DE VENTAS', O.CIUDAD
FROM CLIENTE C
INNER JOIN EMPLEADO E ON C.CODIGO_EMPLEADO_REP_VENTAS=E.CODIGO_EMPLEADO
JOIN OFICINA O ON O.CODIGO_OFICINA=E.CODIGO_OFICINA;
#8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
SELECT E.NOMBRE AS EMPLEADO , X.NOMBRE AS JEFE
FROM EMPLEADO E 
INNER JOIN EMPLEADO X ON E.CODIGO_JEFE=X.CODIGO_EMPLEADO;
#9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
SELECT C.NOMBRE_CLIENTE AS 'CLIENTE', P.FECHA_ENTREGA, FECHA_ESPERADA
	FROM CLIENTE C 
	INNER JOIN PEDIDO P ON C.CODIGO_CLIENTE=P.CODIGO_CLIENTE
	WHERE FECHA_ENTREGA > FECHA_ESPERADA; 
#10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
SELECT P.GAMA AS GAMA_PRODUCTO, C.NOMBRE_CLIENTE
	FROM CLIENTE C 
	JOIN PEDIDO PE ON C.CODIGO_CLIENTE=PE.CODIGO_CLIENTE
	JOIN DETALLE_PEDIDO DP ON PE.CODIGO_PEDIDO=DP.CODIGO_PEDIDO
	JOIN PRODUCTO P ON DP.CODIGO_PRODUCTO=P.CODIGO_PRODUCTO
	GROUP BY P.GAMA, C.NOMBRE_CLIENTE;
#Consultas multitabla (Composición externa)

#Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.

#1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT DISTINCT C.NOMBRE_CLIENTE
	FROM PAGO P
	RIGHT JOIN CLIENTE C ON C.CODIGO_CLIENTE=P.CODIGO_CLIENTE
	WHERE C.CODIGO_CLIENTE NOT IN(SELECT P.CODIGO_CLIENTE
									FROM PAGO P );
#2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún
#pedido.
SELECT DISTINCT C.NOMBRE_CLIENTE
	FROM CLIENTE C
	LEFT JOIN PEDIDO P ON C.CODIGO_CLIENTE=P.CODIGO_CLIENTE
	WHERE C.CODIGO_CLIENTE NOT IN(SELECT P.CODIGO_CLIENTE
								FROM PEDIDO P );
#3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que
#no han realizado ningún pedido.
SELECT DISTINCT C.NOMBRE_CLIENTE
	FROM CLIENTE C
	LEFT JOIN PEDIDO P ON C.CODIGO_CLIENTE=P.CODIGO_CLIENTE
	LEFT JOIN PAGO PA ON C.CODIGO_CLIENTE=PA.CODIGO_CLIENTE
	WHERE P.CODIGO_PEDIDO IS NULL AND PA.CODIGO_CLIENTE IS NULL;
#4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina
#asociada.
SELECT E.NOMBRE, E.APELLIDO1, E.APELLIDO2
	FROM EMPLEADO E 
    LEFT JOIN OFICINA O ON E.CODIGO_OFICINA=O.CODIGO_OFICINA
    WHERE O.CODIGO_OFICINA NOT IN(SELECT O.CODIGO_OFICINA
									FROM OFICINA O);
                                    
#5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente
#asociado
SELECT E.NOMBRE, E.APELLIDO1, E.APELLIDO2
FROM EMPLEADO E 
LEFT JOIN CLIENTE C ON E.CODIGO_EMPLEADO=C.CODIGO_EMPLEADO_REP_VENTAS
WHERE C.CODIGO_EMPLEADO_REP_VENTAS IS NULL;
#6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los
#que no tienen un cliente asociado.
SELECT E.NOMBRE, E.APELLIDO1, E.APELLIDO2
FROM EMPLEADO E 
LEFT JOIN CLIENTE C ON E.CODIGO_EMPLEADO=C.CODIGO_EMPLEADO_REP_VENTAS
LEFT JOIN OFICINA O ON E.CODIGO_OFICINA=O.CODIGO_OFICINA
WHERE C.CODIGO_EMPLEADO_REP_VENTAS IS NULL AND O.CODIGO_OFICINA IS NULL;

