package com.apirestfull.consultaCNPJ.service;

import org.springframework.web.client.RestTemplate;

import com.apirestfull.consultaCNPJ.dto.CnpjDTO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class CnpjServiceImpl implements CnpjService{

    @Value("${api.cnpj.url}")
    private String apiCnpjUrl;
	
	private final RestTemplate restTemplate;

	public CnpjServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
    public CnpjDTO fetchCnpj(String cnpj) throws Exception {
    	
    	//URLAPI configurado em application.properties
    	String URLAPI = apiCnpjUrl + cnpj ;
    	
    	ResponseEntity<CnpjDTO> response = restTemplate.getForEntity(URLAPI, CnpjDTO.class);
    	
    	return response.getBody();
    }
}
