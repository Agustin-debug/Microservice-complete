package com.microservice.department.microservice_department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //Permite que la aplicacion en un servidor, descubra otros servicios que esten registrados al mismo
@SpringBootApplication //Convina las notaciones @Configuration @EnableAutoConfiguration @ComponentScan
public class MicroserviceDepartmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDepartmentApplication.class, args);
    }

}
