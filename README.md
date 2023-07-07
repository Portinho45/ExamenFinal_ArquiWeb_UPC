# **UNIVERSIDAD PERUANA DE CIENCIAS APLICADAS**		
**ARQUITECTURA DE APLICACIONES WEB (SI705)**

**EXAMEN FINAL**

**2023-01**

**Sección:** 	Todos

**Profesores:**	Todos

**Hora Inicio:**   12:10 							**Hora Fin:** 15:00 pm

**Duración:**	170 minutos

**Indicaciones de la Entrega del examen:** 

1. Debe entregar **un archivo Word con las capturas de pantalla de cada una de las historias de usuario solicitadas**. En cada captura de pantalla debe visualizar **su imagen en tiempo real capturada de su cámara** junto** al funcionamiento. El nombre del archivo debe tener la siguiente nomenclatura **api\_examen\_final\_YYYY.** Donde **YYYY** debe reemplazarlo por su código de alumno sin la letra “U”. Por ejemplo, si el código de alumno fuera u2015678 el nombre del proyecto seria api\_examen\_final \_2015678
1. El **archivo comprimido con todas las funcionalidades solicitadas- código fuente de IntellijIdea**. El nombre del archivo debe tener la siguiente nomenclatura **api\_examen\_final\_YYYY.** Donde **YYYY** debe reemplazarlo por su código de alumno sin la letra “U”. Por ejemplo, si el código de alumno fuera u2015678 el nombre del proyecto seria api\_examen\_final \_2015678
1. **Ud. Es responsable de entregar su examen a través del aula virtual, de lo contrario la nota será cero.**
1. **Ud. Es responsable de entrega su examen dentro de los 170 minutos asignados, de lo contrario la nota será cero.**

**Consideraciones importantes:**

<a name="_hlk120624799"></a>**Proyecto**

El nombre del proyecto debe tener la siguiente nomenclatura **api\_examen\_final\_YYYY.** Donde **YYYY** debe reemplazarlo por su código de alumno sin la letra “U”. Por ejemplo, si el código de alumno fuera u2015678 el nombre del proyecto seria api\_examen\_final \_2015678

**Base de datos**

El nombre de la base de datos debe tener la siguiente nomenclatura **db\_examen\_final\_YYYY**. Donde YYYY debe reemplazarlo por su código de alumno sin la letra “U”. Por ejemplo, si el código de alumno fuera u2015678 el nombre de la base de datos seria db\_examen\_final\_2015678

**Variables** 

<a name="_hlk120625218"></a>Las variables de todo el programa se encuentran en inglés

Las variables de todo el programa cumplen el siguiente formato:

**Variable:** age

**Nombre del estudiante:** Juan Luis Pérez Reyes

**Nombre de la variable:** jlprAge

**Tecnologías a utilizar**

- Spring MVC, Spring Boot, Spring Data JPA, Spring security
- Patrón DTO
- Postman
- IntellijIdea
- Postgres
- Formato JSON

**Funcionamiento de API REST**

Se debe enviar las capturas de pantalla necesarias para verificar el funcionamiento completo de cada Historia de usuario solicitada, debe ser un archivo Word. Las capturas deben ser tomadas de Postman.

**Postman** 

Recuerde utilizar Postman para verificar el funcionamiento de la API, en cada una de las historias de usuario solicitadas.






**Enunciado:**

**Caso:** Se le encarga el desarrollo de una API REST que permita las siguientes funcionalidades, tenga en cuenta las características dadas en la historia de usuario.

**Requisitos funcionales**

<a name="_hlk139551999"></a>**Registro de información:**

**HUR01:** Como especialista en marketing quiero registrar campañas publicitarias para gestionarlas.

**Criterios de aceptación:**

\- Se utiliza el método POST para acceder al método.

\- Se utiliza un token para acceder al método con el rol de especialista.

\- Se consideran todos los campos dados en la tabla adjunta.

\- Se accede únicamente con el rol ESPECIALISTA para este método.

\- La ruta para registrar una campaña publicitaria es: api/campaigns.

\- Se adjunta la captura en el documento en Word solicitado, utilizando Postman.

\- Se utiliza el esquema aplicado en clase. El uso de sintaxis o estructuras no desarrolladas en clase anula el puntaje de la historia de usuario.

**HUR02:** Como gerente de marketing quiero registrar metas de ventas para gestionarlas.

**Criterios de aceptación:**

\- Se utiliza el método POST para acceder al método.

\- Se utiliza un token para acceder a la transacción con el rol de gerente.

\- Se consideran todos los campos dados en la tabla adjunta.

\- Se accede con el rol GERENTE para este método.

\- La ruta para registrar una meta de ventas es: api/goals.

\- Se adjunta la captura en el documento en Word solicitado, utilizando Postman.

\- Se utiliza el esquema aplicado en clase. El uso de sintaxis o estructuras no desarrolladas en clase anula el puntaje de la historia de usuario.

**Obtención de información:**

**HUL01:** Como gerente de marketing quiero obtener el rendimiento de las campañas publicitarias.

**Criterios de aceptación:**

\- Se muestra el rendimiento total por campaña publicitaria.

\- Se utiliza el token para acceder al método con el rol de gerente.

\- Se utiliza el método GET para acceder al método.

\- Se considera el rol GERENTE para acceder al método.

\- La ruta base para mostrar el rendimiento de las campañas publicitarias por canal de marketing es: api/ campaigns/.

\- No se ingresa el canal de marketing.

\- Se adjunta la captura en el documento en Word solicitado, utilizando Postman.

\- Se utiliza el esquema aplicado en clase. El uso de sintaxis o estructuras no desarrolladas en clase anula el puntaje de la historia de usuario**.**

**Autenticación y autorización** 

- **HUNF01**: Como usuario quiero autenticarme(login) para gestionar la app del restaurante

**Criterios de aceptación:**

- Verifica que el usuario y el password se encuentren en la base de datos de la app.
- Verifica el rol asignado al usuario.
- Verifica el password encriptado en la base de datos y se usa en la autenticación.
- Genera un token como resultado de la autenticación.
- Los roles y los usuarios se registran por base de datos.
- El registro de usuario y roles se realiza directo en la base de datos, listos para la autenticación.
- Genere las clases necesarias para realizar el registro de usuarios y roles por base de datos.
- Adjunta su captura en el documento en Word solicitado, utilizando Postman.
- Se usa el esquema aplicado en clase. El uso de sintaxis, estructuras no desarrolladas en clase, anula el puntaje de la historia de usuario.

**Atributos de las clases:**

Use la relación pertinente, debe ser una relación de JPA usada en clase.

|**Clases**|
| :- |
|<p>**Campaña**</p><p>=======</p><p>private Int id</p><p>private String name</p><p>private date dateStart</p><p>private String chanelMarketing</p><p></p><p>**Meta**</p><p>=========</p><p>private Int id</p><p>private String name</p><p>private int performance</p><p>idCampaign clave foránea</p>|

**

**Rúbrica de Evaluación:**


|**Criterio de Calificación** |**Excelente** |**Promedio** |**Deficiente** |**Calificación** |
| :- | :- | :- | :- | :- |
|**HUR01**  |<p>La historia de usuario funciona.</p><p>Se realiza el registro solicitado.</p><p>Se cumplen todos los criterios de aceptación de la historia de usuario dada.</p><p>Se adjunta la evidencia en el documento de Word.</p><p>Cumple con la ruta solicitada.</p><p></p>|<p>La historia de usuario funciona.</p><p>Se realiza el registro solicitado.</p><p>Se cumplen algunos de los criterios de aceptación dados en la historia de usuario.</p><p>Se adjunta la evidencia en el documento de Word.</p><p>Cumple con la ruta solicitada.</p><p></p>|<p>No funciona.</p><p>No registra.</p><p>No se cumplen la totalidad de los criterios de aceptación.</p><p></p>| |
| |**3.0 puntos** |**1.5 puntos** |**0 puntos** | |
|**HUR02**|<p>La historia de usuario funciona.</p><p>Se realiza el registro solicitado.</p><p>Se cumplen todos los criterios de aceptación de la historia de usuario dada.</p><p>Se adjunta la evidencia en el documento de Word.</p><p>Cumple con la ruta solicitada.</p><p></p>|<p>La historia de usuario funciona.</p><p>Se realiza el registro solicitado.</p><p>Se cumplen algunos de los criterios de aceptación dados en la historia de usuario.</p><p>Se adjunta la evidencia en el documento de Word.</p><p>Cumple con la ruta solicitada.</p><p></p>|<p>No funciona.</p><p>No registra.</p><p>No se cumplen la totalidad de los criterios de aceptación.</p><p></p>| |
| |**4.0 puntos** |**1.5 puntos** |**0 puntos** | |
|**HUL01**|<p>La historia de usuario funciona.</p><p>Se muestra el cálculo solicitado.</p><p>Se cumplen todos los criterios de aceptación de la historia de usuario dada.</p><p>Se adjunta la evidencia en el documento de Word.</p><p>Cumple con la ruta solicitada.</p><p></p>|<p>La historia de usuario funciona.</p><p>Se muestra el cálculo solicitado.</p><p>Se cumplen algunos de los criterios de aceptación dados en la historia de usuario.</p><p>Se adjunta la evidencia en el documento de Word.</p><p>Cumple con la ruta solicitada.</p><p></p>|<p>No funciona.</p><p>No muestra el cálculo.</p><p>No se cumplen la totalidad de los criterios de aceptación.</p><p></p>||
||**4.0 puntos** |**2 puntos** |**0 puntos** ||
|**HUNF01**|<p>Funciona, permite autenticarse.</p><p>Verifica que el usuario y el password se encuentren en la base de datos de la app</p><p>Verifica el rol asignado al usuario </p><p>Verifica el password encriptado en la base de datos y se usa en la autenticación.</p><p>Genera un token en la autenticación.</p>|<p>No aplica</p><p></p>|<p>No funciona.</p><p>No permite autenticarse.</p><p>No se cumplen la totalidad de los criterios de aceptación.</p><p>No genera el token.</p>| |
| |**4.0 punto** ||**0 puntos** | |
|**Uso de rutas** |Usa las rutas solicitadas de forma completa|No aplica|<p>No usa las rutas solicitadas.</p><p>Algunas rutas se cumplen.</p>||
||**1 punto**||**0 puntos**||
|**Nombre del proyecto y BD**|Usa los nombres solicitados para la BD y para el proyecto|**No aplica**|No coloca de forma completa los nombres solicitados para la BD y para el proyecto||
||**1 punto**||**0 puntos**||
|**Nombre de las variables**|Todos los nombres de las variables se encuentran en inglés y con las iniciales solicitadas.|**No aplica**|Algunas de las variables tienen el nombre en inglés y algunas con las iniciales solicitadas.||
||**3.0 puntos** ||**1.5 puntos** ||
|**Uso de código que no hace nada en el programa**|Se encuentra 1 línea o líneas de código que no hace nada en el programa. ||El código se encuentra limpio y guarda la estructura usada en clase.||
||**-2 puntos**||**0 puntos**||
|**Total** |**20 puntos** |**10 puntos** |**0 puntos** | |




<a name="_hlk120624867"></a>Página 1** de 2**
