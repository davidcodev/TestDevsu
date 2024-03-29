# Test Devsu

El presente proyecto es una prueba Técnica / Práctica para la empresa Devsu

## Resumen:

Se trata de un proyecto que aplica una arquitectura de microservicios (Ver archivo Diagrama_Solucion.png ubicado en la raiz) usando el Framework de SpringBoot, el proyecto está  dividido en 5 módulos (microservicios).

- El primero es un Gateway que se encarga de redireccionar el tráfico que llega desde el puerto 8080 hacia los dos microservicios que se solicitan en la prueba (Clientes, Personas) y (Cuentas, Movimientos); el objetivo es la escalabilidad, por ejemplo si se requiere implementar seguridad (Spring Security) se lo haría en el microservicio Gateway y no en cada uno de los microservicios.

- Luego está un microservicio de configuraciones (Config Server) que se encarga de centralizar la configuración de todos los demás microservicios, este microservicio es el primero en levantar.

- A continuación está el microservicio eureka (Spring Eureka) que registra el funcionamiento de los microservicios, mejorar la escalabilidad y disponibilidad de los mismos además que permite el balanceo de carga entre instancias de los microservicios.

- Finalmente se encuentran los microservicios que realizan la funcionalidad que solicita la prueba. (Clientes y Cuentas).

> **_Orden de ejecución:_**
Para el correcto funcionamiento del proyecto es importante verificar que el motor de base de datos PostgreSQL esté activo, a continuación ejecutar el script BaseDatos.sql que crea un usuario/password y la base de datos que utilizarán los microservicios, luego de esto levantar los microservicios en el siguiente orden:
1. microservice-config
2. microservice-eureka
3. microservice-gateway
4. microservice-customer
5. microservice-account

> **_NOTA:_**  Inicialmente se debe ejecutar el script de base de datos llamado BaseDatos.sql ubicado en la raiz del directorio, las tablas y sus relaciones se crean al momento de ejecutar los microservicios.
