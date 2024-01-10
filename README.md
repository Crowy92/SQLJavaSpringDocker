# SpringBoot-MySql-With-Docker-Compose
The Way of Dockerize a Spring Boot and MySQL Application With Docker Compose.
You can find more informations by : https://medium.com/thefreshwrites/the-way-of-dockerize-a-spring-boot-and-mysql-application-with-docker-compose-de2fc03c6a42

When making changes to the code, in order to see your changes run:
docker-compose up --build
as opposed to just simply 
docker-compose up 
when running the app for the first time.  Make sure to remove all volumes and running containers when done 
using the docker hub gui when finished or via ther terminal if you're feeling fancy.