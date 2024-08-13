package com.apirestfull.consultaCNPJ.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirestfull.consultaCNPJ.Response.CnpjResponse;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class CnpjServiceImpl implements CnpjService {
	
	private final CnpjApiClient cnpjApiClient;
	private final Gson gson = new Gson();
	
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

		return gson.fromJson(jsonResponse, CnpjResponse.class);
	}
}
