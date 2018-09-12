package com.mbps.cd.zipkinservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author EdisonZhou
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ZipkinServiceApplication.class, args);
	}
}
