# Abril15
Abril15

Puntos de hoy:

* Java Empresarial JAVA EE
* JPA y relacion muchos es a uno.
* JSF y CDI (Bean Manejado)
* EJB con conexion a la base de datos.

* Cree un nuevo proyecto Java empresarial usando glassfish.
* Configure ejb.xml (en el modulo de EJB) para que sea la version 3.1

```xml
<?xml version="1.0" encoding="UTF-8"?>
<ejb-jar xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         version="3.2"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/ejb-jar_3_2.xsd">
    
    
</ejb-jar>
```


* Configure el persistence.xml (en el modulo de EJB) el mismo de la clase pasada.

Este archivo no va a estas sino hasta que se cree manualmente, o se cree un bean manejado.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.1" xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
  <persistence-unit name="mipersistencia-PU" transaction-type="JTA">
    <jta-data-source>jdbc/conexionjorge</jta-data-source>
    <properties>
      <property name="javax.persistence.schema-generation.database.action" value="create"/>
    </properties>
  </persistence-unit>
</persistence>

```


* Configure web.xml (en el modulo WAR) para la version 3.2

Web.xml no estara disponible sino hasta que se cree una pagina jsf o un bean manejado. Asi que, cree una pagina y modifique el archivo

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.1" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee           http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd">
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>Faces Servlet</servlet-name>
        <url-pattern>*.xhtml</url-pattern>
    </servlet-mapping>

</web-app>
```

# Proyecto Abril 15.

Necesitamos crear un sistema para ingresar y listar facturas.

## componentes JSF a utilizar

### tabla  

```xml
<h:dataTable value = "#{nombreBean.campo}" var = "alias">
  
</h:dataTable>  
```             

###  boton

```xml
  <h:commandButton value = "Click" action = "#{nombreBean.Funcion}" />
```

###  formulario

```xml
<h:form>
</h:form>
```

### input text

```xml
<h:inputText value = "#{nombreBean.campo}" />
```

### output text

```xml
<h:outputText value = "#{nombreBean.campo}"   />
```
tambien se puede hacer

```html
#{nombreBean.campo}
```

### output text


## Argumentos

* value = "#{beanManejado.campo}"   Asigna un valor a un objeto   
* var = "alias"  Asigna una variable como alias para una de las filas de los datos a mostrar
* rendered = "#{beanManejado.campo}" o "#{not beanManejado.campo}"  Solo se mostrara si el valor es verdadero.  







