# Java SE: SQL y Bases de Datos

Este repositorio contiene ejemplos y conceptos clave aprendidos durante el curso **Java SE: SQL y Bases de Datos** de Platzi. Aquí encontrarás implementaciones prácticas de conexión entre aplicaciones Java y bases de datos, utilizando herramientas como JDBC, JPA y Hibernate.

## Contenido del Repositorio

### 1. **JDBC**
- Configuración y conexión con bases de datos.
- Ejecución de consultas SQL: SELECT, INSERT, UPDATE y DELETE.
- Ejemplos prácticos de manejo de resultados con `ResultSet`.

### 2. **JPA (Java Persistence API)**
- Mapeo de entidades a tablas relacionales.
- Gestión del ciclo de vida de las entidades: persistencia, eliminación y actualizaciones.
- Uso de anotaciones para definir relaciones entre entidades (OneToMany, ManyToOne, etc.).

### 3. **JPQL (Java Persistence Query Language)**
- Creación de consultas orientadas a objetos.
- Uso de parámetros para consultas dinámicas.
- Diferencias clave entre JPQL y SQL estándar.

### 4. **Hibernate**
- Configuración del framework ORM.
- Uso de Hibernate para simplificar la interacción con bases de datos.
- Gestión de sesiones y transacciones con Hibernate.

### 5. **Pools de Conexiones**
- Configuración de pools de conexiones para optimizar el rendimiento.
- Uso de herramientas como HikariCP.

### 6. **Manejo de Transacciones**
- Implementación de commit y rollback para garantizar la integridad de los datos.
- Ejemplos prácticos de manejo de transacciones en operaciones complejas.

## Requisitos
- **Java JDK** 11 o superior.
- **Maven** para gestionar las dependencias.
- Una base de datos relacional (MySQL, PostgreSQL, etc.).
- IDE como IntelliJ IDEA, Eclipse o Visual Studio Code.

## Configuración del Proyecto

1. Clona este repositorio:
   ```bash
   git clone https://github.com/deymerht/Java-JPA.git
   ```

2. Configura tu archivo `application.properties` o `persistence.xml` para definir las credenciales de tu base de datos.

3. Construye el proyecto con Maven:
   ```bash
   mvn clean install
   ```

4. Ejecuta los ejemplos desde el IDE o con el comando:
   ```bash
   java -jar target/archivo.jar
   ```

## Recursos Adicionales
- [Documentación oficial de JDBC](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/)
- [Documentación oficial de JPA](https://jakarta.ee/specifications/persistence/)
- [Guía de Hibernate](https://hibernate.org/)

## Contribuciones
¡Las contribuciones son bienvenidas! Si deseas mejorar este repositorio, crea un fork, realiza los cambios necesarios y envía un pull request.

---

## Autor
- **Deymer Hernández**
- [LinkedIn](https://www.linkedin.com/in/deymerh)

**¡Gracias por visitar este repositorio!** 🚀
