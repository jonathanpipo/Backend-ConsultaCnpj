package com.apirestfull.consultaCNPJ.service;

import com.apirestfull.consultaCNPJ.dto.CnpjDTO;
//import com.apirestfull.consultaCNPJ.response.CnpjResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;


@Service
public class CnpjServiceImpl implements CnpjService {
	
	private final CnpjApiClient cnpjApiClient;
	private final Gson gson = new Gson();
	
	@Autowired
	public CnpjServiceImpl(CnpjApiClient cnpjApiClient) {
		this.cnpjApiClient = cnpjApiClient;
	}

    @Override
    public CnpjDTO fetchCnpj(String CNPJ) throws Exception {
        String jsonResponse = cnpjApiClient.fetchCnpj(CNPJ);
        return parseJsonToCnpjResponse(jsonResponse);
    }

	private CnpjDTO parseJsonToCnpjResponse(String jsonResponse) {
		return gson.fromJson(jsonResponse, CnpjDTO.class);
	}
}
