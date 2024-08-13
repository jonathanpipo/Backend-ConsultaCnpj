package com.apirestfull.consultaCNPJ;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.apirestfull.consultaCNPJ.Service.CnpjServiceImpl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsultaCnpjApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsultaCnpjApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		CnpjServiceImpl CnpjServiceImpl = new CnpjServiceImpl();
		CnpjServiceImpl.getCnpj("09534493000114");
	}

}
