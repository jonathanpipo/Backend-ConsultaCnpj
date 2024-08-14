package com.apirestfull.consultaCNPJ.Service;

import com.apirestfull.consultaCNPJ.Response.CnpjResponseDTO;
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
    public CnpjResponseDTO getCnpj(String CNPJ) throws Exception {
        String jsonResponse = cnpjApiClient.fetchCnpj(CNPJ);
        return parseJsonToCnpjResponse(jsonResponse);    	
    }

	private CnpjResponseDTO parseJsonToCnpjResponse(String jsonResponse) {
		return gson.fromJson(jsonResponse, CnpjResponseDTO.class);
	}
}
