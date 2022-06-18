package com.tutorialspoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurdSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdSpringBootApplication.class, args);
	}

}
/* 
http://localhost:8080/h2-ui
JDBC URL:- jdbc:h2:mem:testdb

http://localhost:8080/emp/hello
http://localhost:8080/emp/allMyEmployees -GET

http://localhost:8080/emp/employee --POST
{  
   "id": "1",  
   "age": "35",  
   "name": "Julie",  
   "email": "julie@gmail.com"  
}   
http://localhost:8080/emp/employees -- ALL Record --GET
http://localhost:8080/emp/employee/3 --GET
http://localhost:8080/emp/employee --PUT
{
   "id": "1",
   "age": "35",
   "name": "Julie33333",
   "email": "julie@gmail.com"
}
http://localhost:8080/emp/employee/6 --DELETE
 */