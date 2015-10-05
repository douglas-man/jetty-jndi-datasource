This is a simple servlet example explaining an use of the JPA EntityManager to store or make changes to an instance of an Oracle XE database. The application is from an example of a book on Web Application using Java EE (with Spring 4).

The original application was based on Tomcat and mySQL.  Since I am a fan of jetty (maven jetty plugin), I've modified this applicaton to base on a jetty configuration for a jndi data source. The benefits of using a jndi data source is that once it's set up, one can just forget about the configuration and simply re-applying it to other projects.  There's no war file to build or deploy.  Simply type mvn jetty:run ...

There are prerequisite for this to actually be successful:

1. An instance of an Oracle database with user name: EntityMappings.
2. JDK 1.8
3. Maven 3.3.3 installed.
4. jetty.xml file must be properly configured to have the correct database connection properties (see the code ...)
5. Download and Install oracle driver into to your local maven repository: mvn install:install-file -Dfile=/home/jsmith/Downloads/ojdbc6_g.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar
