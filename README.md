This a simple servlet example but using JPA EntityManager to store or make changes to an instance of an Oracle XE database.
The application is from an example of a book on Web Application using Java EE (with Spring 4).

The original application was based on Tomcat and mySQL.  Since I am a fan of jetty (maven jetty plugin), I've modified this applicaton to base on a jetty configuration for a jndi data source.

The pom.xml should be ready to build and run if you have an instance of an Oracle database with user name: EntityMappings, JDK 1.8, and Maven 3.3.3 installed.

Actually, one would have to edit jetty.xml file for the database connection properties before it can be build and run.

e.g. mvn jetty:run
