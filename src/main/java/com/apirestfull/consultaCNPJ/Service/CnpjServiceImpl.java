package com.apirestfull.consultaCNPJ.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirestfull.consultaCNPJ.Response.CnpjResponse;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class CnpjServiceImpl implements CnpjService {
	
	private final CnpjApiClient cnpjApiClient;
	
	@Autowired
	public CnpjServiceImpl(CnpjApiClient cnpjApiClient) {
		this.cnpjApiClient = cnpjApiClient;
	}

    @Override
    public CnpjResponse getCnpj(String CNPJ) throws Exception {
        String jsonResponse = cnpjApiClient.fetchCnpj(CNPJ);
        return parseJsonToCnpjResponse(jsonResponse);    	
    }


	private CnpjResponse parseJsonToCnpjResponse(String jsonResponse) {
		//Utilizar GSON para serializar o JSON
		// return gson.fromJson(json, CnpjResponse.class);
		
		CnpjResponse cnpjResponse = new CnpjResponse();
		// Preencher o objeto com dados extraídos do JSON
		// cnpjResponse.setCnpj(...);
		// cnpjResponse.setNome(...);

		return null;
	}
}
