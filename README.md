[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/DOd7VvZo)
# Laboratorio 1 BackEnd
## Enunciado de la Tarea
### **Objetivo**
Desarrollar una API REST utilizando Spring Boot que se conecte a una base de datos MySQL. La API debe permitir la gestión de un inventario de productos con los siguientes campos: id, name, description, price, y quantity. Además, deben realizar pruebas de la API utilizando Postman y entregar la tarea mediante GitHub Classroom con documentación detallada y capturas de pantalla descriptivas.
### **Requisitos**
#### 1. Configuración del Proyecto:
- **Haber realizado la actividad teórica sobre API y Spring Boot**
- **Haber realizado la demo del video o la del .pdf**
- Utiliza Spring Initializr para generar el proyecto Spring Boot con las dependencias necesarias: Spring Web, Spring Data JPA, Lombok, DevTools y MySQL Driver/PostgreSQL Driver.
- Configura el proyecto para conectarse a una base de datos MySQL local o en la nube. En caso de utilizar la nube optar por PostgreSQL Driver y Render.com
#### 2. Modelo de Datos:
- Crea una entidad `Product` con los siguientes campos:
  - `id` (Long, autogenerado)
  - `name` (String)
  - `description` (String)
  - `price` (double)
  - `quantity` (int)
#### 3. Repositorio:
- Crea un repositorio JPA para la entidad `Product`.
#### 4. Controlador:
- Implementa un controlador REST que permita realizar las siguientes operaciones:
  - Crear un nuevo producto (POST `/products`)
  - Obtener todos los productos (GET `/products`)
  - Obtener un producto por su id (GET `/products/{id}`)
  - Actualizar un producto existente (PUT `/products/{id}`)
  - Eliminar un producto por su id (DELETE `/products/{id}`) 
#### 5. Pruebas con Postman:
- Realiza pruebas de todas las operaciones anteriores utilizando Postman.
- Captura de pantalla de las pruebas realizadas en Postman.
#### 6. Documentación:
- Crea un archivo README.md en el repositorio de GitHub con una descripción detallada del proyecto.
- Incluir instrucciones sobre cómo configurar y ejecutar el proyecto.
- Incluir capturas de pantalla de las pruebas realizadas en Postman.
### Entrega
1. Repositorio en GitHub Classroom:
- Subí el código del proyecto a un repositorio en GitHub Classroom.
- Asegurate de incluir el archivo README.md con la documentación detallada.
- Incluir capturas de pantalla de las pruebas realizadas en Postman.
### Evaluación
La tarea será evaluada con base en los siguientes criterios:
- Correcta implementación de la API REST con Spring Boot.
- Correcta configuración y conexión a la base de datos MySQL/PostgreSQL.
- Funcionamiento correcto de las operaciones CRUD.
- Calidad de las pruebas realizadas con Postman.
- Calidad y claridad de la documentación y las capturas de pantalla.


# Documentacion sobre el trabajo

#### Explicacion del Mapping / Controlled
- @RequestMapping(“/api/v1/students”): Define la ruta base para todas las solicitudes manejadas por este controlador.
- @GetMapping: Maneja solicitudes GET a /api/v1/students.
- @GetMapping(“/{id}”): Maneja solicitudes GET a /api/v1/students/{id}.
- @PostMapping: Maneja solicitudes POST a /api/v1/students.
- @PutMapping(“/{id}”): Maneja solicitudes PUT a /api/v1/students/{id}.
- @DeleteMapping(“/{id}”): Maneja solicitudes DELETE a /api/v1/students/{id}.
  
#### Explicacion de Student.java
- @NoArgsConstructor: Genera un constructor sin argumentos.
- @AllArgsConstructor: Genera un constructor con un argumento para cada campo de la clase.
- @Data: Genera automáticamente getters, setters, toString(), equals(), y hashCode().
- @Entity(name = “student”): Marca esta clase como una entidad JPA y define el nombre de la tabla en la base de datos como “student”.
- @Id: Indica que el campo id es la clave primaria de la entidad.
- @GeneratedValue(strategy = GenerationType.IDENTITY): Especifica que el valor del id se generará automáticamente por la base de datos.
- @Column(length = 30): Define la longitud máxima de los campos name y course en la base de datos.

###### Resumen
- El código define una entidad Student con tres campos: id, name y course. Utiliza anotaciones de Lombok para generar automáticamente anotaciones de JPA para mapear la clase a una tabla en la base de datos.

#### Explicacion sobre StudentRepository
- @Repository: Marca esta interfaz como un componente de Spring que interactúa con la base de datos.
- JpaRepository<Student, Long>: Define una interfaz que extiende JpaRepository. Esto proporciona métodos CRUD (Crear, Leer, Actualizar, Eliminar) y otras operaciones de base de datos para la entidad Student.
- JpaRepository<Student, Long>: JpaRepository es una interfaz de Spring Data JPA que proporciona métodos genéricos para operaciones CRUD y más. Los parámetros genéricos <Student, Long> indican que esta interfaz maneja la entidad Student y que la clave primaria de Student es de tipo Long.

###### Resumen
- Este repositorio permite realizar operaciones de base de datos sobre la entidad Student sin necesidad de escribir código SQL explícito. Spring Data JPA se encarga de generar las implementaciones necesarias en tiempo de ejecución.

#### Postman GET / POST / PUT / DELETE
- GET: Para obtener datos.
- POST: Para crear nuevos datos.
- PUT: Para actualizar datos existentes.
- DELETE: Para eliminar datos.

![Captura de pantalla 2024-09-04 101348](https://github.com/user-attachments/assets/6a6c5833-49a3-46cd-8f66-c2044585e6d6)
![Captura de pantalla 2024-09-04 101249](https://github.com/user-attachments/assets/61b26095-6eed-4f86-9fc5-aff3667d6a88)

