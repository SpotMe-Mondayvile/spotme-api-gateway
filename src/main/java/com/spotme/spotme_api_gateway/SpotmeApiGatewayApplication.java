package com.spotme.spotme_api_gateway;

import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.netty.http.client.HttpClient;

@SpringBootApplication
public class SpotmeApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotmeApiGatewayApplication.class, args);
	}
//	@Bean
//	public HttpClient httpClient() {
//		return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
//	}

}
