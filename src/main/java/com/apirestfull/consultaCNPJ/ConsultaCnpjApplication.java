package com.apirestfull.consultaCNPJ;

import com.apirestfull.consultaCNPJ.Model.CnpjResponse;
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

		CnpjApiClient apiClient = new CnpjApiClient();
	    CnpjServiceImpl service = new CnpjServiceImpl(apiClient);
	    
	    try {
	        CnpjResponse response = service.getCnpj("09534493000114");
	        System.out.println("Parsed Response: " + response);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
