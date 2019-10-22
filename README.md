# java-MVC-login-and-registration

1. IDE: Eclipse, Database: oracle Ojdbc14.jar, Server: Tomcat v9
2. Create a Dynamic Web Project (Web Module version 2.4)
3. Right click on project Go to Build Path add Ojdbc14.jar in libraries.
4. Go to web deployment assembly add Ojdbc14.jar.

Frontend
 - Welcome.html
 - Register.html
 - Login.html
 - RegisterSuccess.html
 - RegisterFailed.html
 - Login Success.html
 - LoginFailed.html

Backend
 - Model.java (Normal Java File)
 - Register.java (Servlet file)
 - Login.java (Servlet file)
 
 Database Table - student
 sql Query-

 CREATE TABLE  "STUDENT1" 
   (	
     "NAME" VARCHAR2(400) NOT NULL, 
	   "USN" VARCHAR2(4000), 
	   "PWD" VARCHAR2(4000)
   );

