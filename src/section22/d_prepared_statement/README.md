### PreparedStatement:
- A PreparedStatement in JDBC, is a precompiled SQL statement.
- A PreparedStatement is used to execute the same statement multiple times, with parameter value placeholders.
- A parameter in an SQL string passed to a PreparedStatement, is defined with a question mark as a placeholder, shown in this example.
- Importantly, PreparedStatements help prevent SQL injection attacks.
```declarative
    String sql = "SELECT * FROM music.albumview where artist_name = ?";
    PreparedStatement ps = connection.prepareStatement(sql);
    ps.setString(1, "Bob Dylan");
    ResultSet resultSet = ps.executeQuery();
```
### The PreparedStatement has many advantages over the Statement:
- Precompilation 
- Parameterized Queries 
- Efficient Reuse 
- Automatic Type Conversion 
- Readability and Maintainability 
- Type Safety
