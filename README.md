# Api con oracle

En  esta actividad he desarrollado una api con arquetictura REST simple que nos permite registrar usuarios, logearnos y cambiar el nombre usando La base de datos Oracle

## Dependencias usadas:
-   spring-boot-starter-web
-   spring-boot-devtools
-   com.oracle.database.jdbc
-   lombok
-   spring-boot-starter-test

## Arquitectura
El proyecto esta diseñado para que sea sencillo pero escalable, empezamos por el  aplicaccion properties que dispone de lo necesario para conectarnos a una base de dato ya existente de oracle en nuestro sistema, llamada api login, con el usuario mio personal que es perico y de contraseña password.
#### La aplicacion se compone de:
-   ApiOracleApplication.java, donde se ejecuta el programa
-   Carpeta classes: aquí estan ubicadas todas las clases convencionales de java, en esta actividad solo esta la clase User y sus respectivas peticiones
-   carpeta controller: se úbica el unico controlador, y todos los que se desarrollen en un hipotetico fururo
-   carpeta repositories: se úbica el unico repositorio, y todos los que se desarrollen en un hipotetico fururo