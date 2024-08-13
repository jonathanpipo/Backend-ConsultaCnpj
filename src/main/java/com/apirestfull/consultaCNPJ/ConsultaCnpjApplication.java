package com.apirestfull.consultaCNPJ;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.apirestfull.consultaCNPJ.Response.CnpjResponse;
import com.apirestfull.consultaCNPJ.Service.CnpjApiClient;
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
		/*
		CnpjApiClient cnpjApiClient = new CnpjApiClient();
		CnpjServiceImpl CnpjServiceImpl = new CnpjServiceImpl(cnpjApiClient);
		System.out.println(CnpjServiceImpl.getCnpj("09534493000114"));
		 */

		
		CnpjApiClient apiClient = new CnpjApiClient();
	    CnpjServiceImpl service = new CnpjServiceImpl(apiClient);
	    
	    try {
	        String jsonResponse = apiClient.fetchCnpj("09534493000114");
	        System.out.println("JSON Response: " + jsonResponse);
	        
	        CnpjResponse response = service.getCnpj("09534493000114");
	        System.out.println("Parsed Response: " + response);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
