package com.example.springbootmysql;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;


@OpenAPIDefinition(info = @Info(title = "Microservicio Employees",
        version = "1.0.0",
        description = "APIs Swagger Microservicio Employees",
        license = @License(name = "Apache 2.0",
                url = "http://www.apache.org/licenses/LICENSE-2.0.html")),
        servers = {
                @Server(description = "ambiente local", url = "http://localhost:8080/")}

)



@SpringBootApplication
@EnableAsync
public class SpringbootmysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmysqlApplication.class, args);
    }

}
