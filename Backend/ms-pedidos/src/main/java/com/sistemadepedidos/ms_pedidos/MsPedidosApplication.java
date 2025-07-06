package com.sistemadepedidos.ms_pedidos; // Changed package to match the module and test class

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Main entry point for the MS Pedidos Spring Boot application.
 * This class uses @SpringBootApplication to enable auto-configuration,
 * component scanning, and define this as a Spring Boot application.
 * @EnableDiscoveryClient is added for service registration and discovery.
 */
@SpringBootApplication
@EnableDiscoveryClient // Enable service registration and discovery if you are using a discovery server (e.g., Eureka)
public class MsPedidosApplication {

    /**
     * The main method that starts the Spring Boot application.
     *
     * @param args Command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(MsPedidosApplication.class, args);
    }

}
