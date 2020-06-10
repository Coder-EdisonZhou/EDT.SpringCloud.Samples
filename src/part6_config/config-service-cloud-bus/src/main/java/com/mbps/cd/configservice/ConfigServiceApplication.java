package com.mbps.cd.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author edisonzhou
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

	public static void main(String[] args) {
		// 如果不需要设置代理，则注释掉以下两行代码
		setHttpProxy();
		setHttpsProxy();

		SpringApplication.run(ConfigServiceApplication.class, args);
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
		String proxyHost = "10.128.255.41";
		String proxyPort = "80";

		System.setProperty("https.proxyHost", proxyHost);
		System.setProperty("https.proxyPort", proxyPort);
	}
}
