package com.apirestful.consultacnpj.service;

import org.springframework.web.client.RestTemplate;

import com.apirestful.consultacnpj.dto.CnpjDTO;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class CnpjServiceImpl implements CnpjService {

    @Value("${api.cnpj.url}")
    private String apiCnpjUrl;
	
	private final RestTemplate restTemplate;

	public CnpjServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
    @Override
    public Optional<CnpjDTO> fetchCnpj(String CNPJ) throws Exception {
        
    	String URLAPI = apiCnpjUrl + CNPJ;
    	
    	CnpjDTO cnpjDTO = restTemplate.getForObject(URLAPI, CnpjDTO.class);
    	
        return Optional.ofNullable(cnpjDTO);
    }
}
