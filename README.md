# SpringBootProjects

<!-- database connectivity properties are added to application.properties which are -->


spring.datasource.url=jdbc:sqlserver://localhost;databaseName=test
<!-- test is the database --> 
spring.datasource.username=tomy
<!-- here user is tomy and below password aswell --> 
spring.datasource.password=tomy
spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto = create-drop

<!-- mssql dependency in pom.xml --> mssql dependency in pom.xml
<dependency>
			<groupId>com.microsoft.sqlserver</groupId>
			<artifactId>mssql-jdbc</artifactId>
			<scope>runtime</scope>
		</dependency>
