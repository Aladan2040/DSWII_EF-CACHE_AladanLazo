package com.cibertec.DSWII_EF_CACHE_AladanLazo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DswiiEfCacheAladanLazoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiEfCacheAladanLazoApplication.class, args);
	}

}
