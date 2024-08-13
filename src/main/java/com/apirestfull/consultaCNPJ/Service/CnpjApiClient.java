package com.apirestfull.consultaCNPJ.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Component;


@Component
public class CnpjApiClient {
	
	private final HttpClient httpClient;

	public CnpjApiClient() {
		this.httpClient = HttpClient.newHttpClient();
	}
	
    public String fetchCnpj(String CNPJ) throws Exception {
    	
        String URLAPI = "https://publica.cnpj.ws/cnpj/" + CNPJ ;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URLAPI))
                .build();
        HttpResponse<String> response = httpClient
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();

    }
	
	

}
