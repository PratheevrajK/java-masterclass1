### JDBC(Java DataBase Connectivity):
- Java's way of providing a consistent way to connect to a wide variety of databases, including relational, NoSQL, and object-oriented databases.
- It abstracts the complexities of connecting to different databases, through a common interface.

### JDBC Driver:
- To use a particular data source from an application, you'll need a JDBC driver for that data source.
- Drivers are usually provided by the database vendor, either as a library jar, or a java module, which we can import into our application.

### java.sql and javax.sql:
- JDBC consists of two packages
  - java.sql - core JDBC with `DriverManager` and `ResultSet`
  - javax.sql - provides the API for server side data source access with `DataSource` and `RowSet`.

### How to add MySQL JDBC Driver to the app:
- Open Module Settings -> Project Settings -> Libraries -> Maven -> Search MySQL Connector -> Add the latest version.

