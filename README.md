# **UNIVERSIDAD PERUANA DE CIENCIAS APLICADAS**		
**ARQUITECTURA DE APLICACIONES WEB (SI705)**

**Enunciado:**

**Pregunta (20 p.).**

Se le encarga el desarrollo de una API REST que permita las siguientes funcionalidades.

**Requisitos funcionales**

- Registro de información
  - Registro de cuenta bancaria (POST)
  - Registro de transacción bancaria. (POST)
- Listado de información
  - Listado de todas las cuentas bancarias (GET)
  - Listado de transacciones bancarias por nombre de cliente (GET)
  - Listado de transacciones bancarias por rango de fechas. (GET)
- Login
  - Verificar las credenciales del usuario
  - Verificar los roles del usuario

- Roles **a asignar:** Cree dos roles a nivel de base de datos
  - ADMINISTRADOR: Acceso solo a registrar
  - USUARIO: Acceso solo a los listar

Manejo de seguridad: Se podrá acceder sólo si el usuario se encuentra autenticado con token y cuenta con un rol asignado

**Atributos de las clases / Columnas de las tablas**

La relación es de uno a muchos desde Account (Cuenta bancaria) a Transaction (Transacción bancaria)

|Clases|Tablas|
| :- | :- |
|<p>Account</p><p>=======</p><p>private Long id</p><p>private String nameCustomer</p><p>private String numberAccount</p><p></p><p>Transaction</p><p>=========</p><p>private Long id</p><p>private String type</p><p>private LoalDate createDate</p><p>private Double amount</p><p>private Double balance</p><p>private Account account</p><p></p>|<p>accounts</p><p>========</p><p>id</p><p>name\_customer</p><p>number\_account</p><p></p><p>transactions</p><p>=========</p><p>id</p><p>type</p><p>create\_date</p><p>amount</p><p>balance</p><p>account\_id</p>|



<a name="_hlk120624799"></a>**Datos del proyecto y base de datos**

**Proyecto**

- El nombre del proyecto debe tener la siguiente nomenclatura **api\_examen\_final\_XXXX.** Donde **XXXX** debe reemplazarlo por su código de alumno sin la letra “U”. Por ejemplo, si el código de alumno fuera u2015678 el nombre del proyecto seria api\_examen\_final \_2015678

**Base de datos**

- El nombre de la base de datos debe tener la siguiente nomenclatura **db\_examen\_final\_XXXX**. Donde XXXX debe reemplazarlo por su código de alumno sin la letra “U”. Por ejemplo, si el código de alumno fuera u2015678 el nombre de la base de datos seria db\_examen\_final\_2015678
- El gestor de base de datos debe ser PostgreSQL. El nombre de las tablas debe ser “books” y “loans”

<a name="_hlk120625218"></a>**Datos para probar API REST**

En el anexo, página 8, encontrará ejemplos como referencia para realizar la prueba de su API en Postman o Swagger.


<a name="_hlk120624867"></a>**Requisitos no funcionales**

- Puede utilizar Postman o Swagger para realizar la prueba del API REST.

- El nombre de los endpoints (url) a utilizar en los controllers debe ser
  - La ruta base de los endpoints debe ser /api/bank/v1
  - La ruta para el registro de cuenta bancaria debe ser /api/bank/v1/accounts
  - La ruta para el listado de cuentas bancarias debe ser /api/bank/v1/accounts
  - La ruta para el registro de transacciones bancarias debe ser /api/bank/v1/accounts/{id
  - }/transactions
  - La ruta para el listado de transacciones por nombre de cliente /api/bank/v1/transactions/filterByNameCustomer
  - La ruta para el listado de transacciones bancarias por rango de fechas debe ser /api/bank/v1/transactions/filterByCreateDateRange


Página 1** de 2**

