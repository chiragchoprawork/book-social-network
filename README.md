Book Social Network uses Spring Boot for backend services, PostgreSQL for efficient database management, JWT for secure user authentication, and CRUD operations for book and user interaction management. I built a responsive frontend using Angular, featuring a sleek UI crafted with CSS and Bootstrap, enhancing user experience.

**Tech Stack:**  
**Backend:**  
- Spring Boot 3  
- Java (version 17)  
- Spring Security 6  
- JWT Token Authentication  
- Spring Data JPA  
- JSR-303( Bean Config) and Spring Validation  
- OpenAPI and Swagger UI Documentation  

**Frontend:** 
- Angular(Version 16)  
- Lazy Loading  
- Authentication Guard  
- OpenAPI Generator for Angular  
- Bootstrap  

**Database:**
- PostgreSQL(Version 16.3)  
(Installation Instruction: https://postgresapp.com/downloads.html)  
- pgAdmin 4 for graphical interface of the database  

**Spring Boot**
Spring dependencies were installed from https://start.spring.io    
- Spring Web: To create API, it uses ApacheTomcat as the default embedded container  
- Spring Data JPA: Database to process data  
- Validation: To Validate Input  
- JavaMail Sender: To use email functionality   
- Spring Security: Implemented security based on JWT   
- Thymeleaf: To implement better email templates  
- PostgreSQL Diver: For our database  
- Lombok: To reduce boilerplate code  

**Other dependencies:**  
- Docker: Future scope can be to containerize the code but here needed for MailDev Functionality.
  (Installation instruction: https://www.docker.com/products/docker-desktop/)
- MailDev: It is a simple way to test your project's generated email during development. It was used to create emails for testing.  
- My current codebase MailDev is configured in Docker Compose yml file and can be run using the below command.  
$ docker run -p 1080:1080 -p 1025:1025 maildev/maildev  

**OpenAPI:**
- It was installed separately in pom.xml as springdoc-openapi-starter-webmvc-ui 


