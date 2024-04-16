# Como crear una API Rest con relacion en Spring

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

## 🛠 Skills
Java, sprintboot, mysql

Para poder crear una api en java con sprint, lo primero que necesitamos es configurar nuestro proyecto de `spring` como en la siguiente imagen se muestra.
Las dependecias seran:
  - **Spring Web:** nos ayuda ejecutar y a utlizar todas las tecnologias de springweb (API Rest) y crea nuestro servidor en Tomcat
  - **Spring Data JPA:** nos permite manejar la bd mediante `hibernate` y `Spring Data` mediante la persistencia
  - **Lombok:** nos ayuda a disminuir el codigo de los entitys de nuestras tablas (`getters` & `setters`)
  - **H2 DataBase:** es una bd que esta integrada en nuestra aplicacion

<image src="https://github.com/monnsmonsh/API-REST-OneToMany-Spring/blob/main/Resoucers/config_spring.png" alt="Config spring">

  ## Software utilizado
- IntelliJ IDEA 
- Postman

No es necesario utilizar `IntelliJ IDEA` puedes utilizar cualquier otro IDE que soporte java.
creamos un archivo en la ruta resources con el nombre `application.ymc`
y configuramos nuestra conexion 

--

despues proseigmos con nuestras entidades
