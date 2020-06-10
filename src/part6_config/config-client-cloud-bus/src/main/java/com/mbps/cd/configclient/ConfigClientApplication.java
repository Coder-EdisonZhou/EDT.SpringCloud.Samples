package com.mbps.cd.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		//setHttpProxy();
		//setHttpsProxy();

		SpringApplication.run(ConfigClientApplication.class, args);
	}

	// 由于公司网络限制，需要设置HTTP代理才能访问互联网
	public static void setHttpProxy(){
		String proxyHost = "192.168.36.";
		String proxyPort = "3266";

		System.setProperty("http.proxyHost", proxyHost);
		System.setProperty("http.proxyPort", proxyPort);
	}

	// 由于公司网络限制，需要设置HTTPS代理才能从GitHub上Clone
	public static void setHttpsProxy(){
		String proxyHost = "192.168.60.204";
		String proxyPort = "3266";

		System.setProperty("https.proxyHost", proxyHost);
		System.setProperty("https.proxyPort", proxyPort);
	}
}
