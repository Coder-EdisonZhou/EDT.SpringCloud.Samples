package com.mbps.cd.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {

	public static void main(String[] args) {
		//setHttpProxy();
		//setHttpsProxy();

		SpringApplication.run(ConfigClientApplication.class, args);
	}

	// 由于公司网络限制，需要设置HTTP代理才能访问互联网
	public static void setHttpProxy(){
		String proxyHost = "10.248.36.";
		String proxyPort = "3266";

		System.setProperty("http.proxyHost", proxyHost);
		System.setProperty("http.proxyPort", proxyPort);
	}

	// 由于公司网络限制，需要设置HTTPS代理才能从GitHub上Clone
	public static void setHttpsProxy(){
		String proxyHost = "10.248.60.204";
		String proxyPort = "3266";

		System.setProperty("https.proxyHost", proxyHost);
		System.setProperty("https.proxyPort", proxyPort);
	}
}
